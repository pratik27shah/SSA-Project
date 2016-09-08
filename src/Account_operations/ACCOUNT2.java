package Account_operations;

import mda_efs_states.*;
import datastore.*;

public class ACCOUNT2 {
	mda_efs objmdaefsm = null;
	/* Pointer to DataStore */
	datastore objdataStore = null;

	public ACCOUNT2(mda_efs objmdaefsm, datastore objdatastore) {
		this.objmdaefsm = objmdaefsm;
		this.objdataStore = objdatastore;
	}

	public void open(int p, int y, int a) {

		((datastore_Account2) this.objdataStore).temp_pin = p;
		((datastore_Account2) this.objdataStore).temp_uid = y;
		((datastore_Account2) this.objdataStore).temp_bal = a;
		(this.objmdaefsm).open();

	}

	public void login(int y) {
		int uid = ((datastore_Account2) this.objdataStore).getuid();
		if (y != uid) {
			(this.objmdaefsm).IncorrectLogin();
		} else
			((this.objmdaefsm)).login();

	}

	/*
	 * Purpose:To check in pin is correct or not
	 */
	public void pin(int p) {
		int pin = ((datastore_Account2) this.objdataStore).Getpin();

		if (pin == p) {
			{
				this.objmdaefsm.CorrectPinAboveMin();
			}
			// else this.objmdaefsm.CorrectPinBelowMin();
		} else{
		//	System.out.println("Atm-22222 in");
			this.objmdaefsm.IncorrectLogin_Attempts(2);}
	}

	/*
	 * Purpose:Deposit the amount and increase the balance
	 */
	public void deposit(int d) {
		((datastore_Account2) this.objdataStore).temp_deposit = d;
		((datastore_Account2) this.objdataStore).setdeposit();
		((datastore_Account2) this.objdataStore).compute_balance();
		int amt = ((datastore_Account2) this.objdataStore).getbal();
		// if(amt<=500){this.objmdaefsm.BelowMinBalance();}
		// else
		this.objmdaefsm.AboveMinBalance();

	}

	/*
	 * Purpose:Calls the suspend state
	 */
	public void suspended() {
		this.objmdaefsm.Suspended();
	}

	public void activated()
	{
		this.objmdaefsm.Activated();
	}
	/*
	 * Purpose:Display Balance
	 */
	public void balance() {
		this.objmdaefsm.Balance();}
	
	public void logout(){
		this.objmdaefsm.logout();
		
	}/*Withdraw amount*/

	public void withdraw(int w) {
		((datastore_Account2)this.objdataStore).temp_withdraw=w;
		((datastore_Account2)this.objdataStore).Set_withdraw();
		int bal = ((datastore_Account2) this.objdataStore).getbal();
		if (bal < 0) {
			this.objmdaefsm.Nofunds();
		} else{
			this.objmdaefsm.WithdrawAboveMinBalance();
		this.objmdaefsm.withdraw2();	
		}
	}
	
	public void Close()
	{
		this.objmdaefsm.Close();
		
	}
}
