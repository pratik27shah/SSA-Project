package Account_operations;

import mda_efs_states.*;
import datastore.*;

public class ACCOUNT1 {
	mda_efs objmdaefsm = null;
	/* Pointer to DataStore */
	datastore objdataStore = null;

	public ACCOUNT1(mda_efs objmdaefsm, datastore objdatastore) {
		this.objmdaefsm = objmdaefsm;
		this.objdataStore = objdatastore;
	}
/*Open the atm and save pin,bal and amount*/
	public void open(String p, String y, Float a) {

		((datastore_Account1) this.objdataStore).temp_pin = p;
		((datastore_Account1) this.objdataStore).temp_uid = y;
		((datastore_Account1) this.objdataStore).temp_bal = a;
		 ((datastore_Account1)this.objdataStore).Setbal();
		
		 (this.objmdaefsm).open();

	}

	/*
	 * Purpose:Login in uid match found or else go to incorrect login
	 */
	public void login(String y) {
		String uid = ((datastore_Account1) this.objdataStore).getuid();
		if (!y.equals(uid)) {
			(this.objmdaefsm).IncorrectLogin();
		} else
			((this.objmdaefsm)).login();
	}

	/*
	 * Purpose:To check in pin is correct or not
	 */
	public void pin(String p) {
		String pin = ((datastore_Account1) this.objdataStore).Getpin();

		if (pin.equals(p)) {
			if (((datastore_Account1) this.objdataStore).getbal() < 500) {
				this.objmdaefsm.CorrectPinBelowMin();
			} else
				this.objmdaefsm.CorrectPinAboveMin();
		} else
			this.objmdaefsm.IncorrectLogin_Attempts(3);
	}

	/*
	 * Purpose:Deposit the amount and increase the balance
	 */
	public void deposit(float d) {
		((datastore_Account1) this.objdataStore).temp_deposit = d;
		((datastore_Account1) this.objdataStore).setdeposit();
		((datastore_Account1) this.objdataStore).compute_balance();
		float amt = ((datastore_Account1) this.objdataStore).getbal();
		if (amt <= 500) {
			this.objmdaefsm.BelowMinBalance();
		} else
			this.objmdaefsm.AboveMinBalance();

	}

	/*
	 * Purpose:Checks for pin match in lock stage
	 */
	public void lock(String x) {
		String pin = ((datastore_Account1) this.objdataStore).Getpin();
		if (pin.equals(x)) {
			this.objmdaefsm.locked();
	//this.objmdaefsm.Locked();
		} else
			this.objmdaefsm.IncorrectLock();

	}

	/*
	 * Purpose:Check for pin match in lock stage
	 */
	public void unlock(String x) {
		String pin = ((datastore_Account1) this.objdataStore).Getpin();
		if (!pin.equals(x)) {
			this.objmdaefsm.IncorrectUnlock();
		} else{
			this.objmdaefsm.Unlock();
			
			float bal = ((datastore_Account1) this.objdataStore).getbal();
			if ((bal) > 500) {
				this.objmdaefsm.AboveMinBalance();
			} else {
				this.objmdaefsm.BelowMinBalance();
			}
		}

	}

	/* Purpose Withdraw amount from balance */

	public void withdraw(Float d) {
		((datastore_Account1) this.objdataStore).temp_withdraw = d;
		((datastore_Account1) this.objdataStore).Set_withdraw();
	//	this.objmdaefsm.Withdraw();
		float bal = ((datastore_Account1) this.objdataStore).getbal();
		if ((bal - d) > 500) {
			this.objmdaefsm.WithdrawAboveMinBalance();
		} else {
			this.objmdaefsm.WithdrawBelowMinBalance();
		}

	}
/*Purpose Get balance and display
 * 
 * */
	public void balance() {
		this.objmdaefsm.Balance();
		//System.out.print();

	}
	
	public void logout(){
		this.objmdaefsm.logout();
		
	}
}
