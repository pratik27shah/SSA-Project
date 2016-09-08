package mda_efs_states;

import datastore.datastore;
import datastore.datastore_Account1;
import output.output;
import abstract_factory.*;

/*Purpose:MDA EFS,calls and updates the states
 * 
 * 
 * */
public class mda_efs {
	abstract1 objAbstract1 = null;
	output objoutput = null;
	int Total_attempts = 0;
	Total_States current_state_status = null;;
	Total_States start = new Start(this);
	Total_States idle = new Idle(this);
	Total_States Check_pin = new Check_pin(this);
	Total_States overdrawn = new Overdrawn(this);
	Total_States ready = new Ready(this);
	Total_States lock = new locked(this);
	Total_States close = new close(this);
	Total_States suspend = new suspended(this);
	//Total_States activated=new activate(this);
	Total_States s1=new S1(this);
	public mda_efs(abstract1 objAbstract1, output objOutput) {
		this.objAbstract1 = objAbstract1;
		this.objoutput = objOutput;
		this.current_state_status = start;
	}

	public void SetState(Total_States prmTotal_States) {
		this.current_state_status = prmTotal_States;
	}

	public Total_States s1(){return this.s1;}
	
	public void GetShow_CurrentStatus() {
		System.out.println("The System is in the Current State of ---> "
				+ this.current_state_status.getClass().getName().toString());
	}

	public void open() {
		(this.current_state_status).Open();
		GetShow_CurrentStatus();
	}
	/**Returns object of th state**/
	public Total_States idle() {
		return idle;
	}
	/**Returns object of th state**/
	public Total_States overdrawn() {
		return overdrawn;
	}
	/**Returns object of th state**/
	public Total_States ready() {
		return ready;
	}
	/**Returns object of th state**/
	public Total_States locked() {
		return lock;
	}/**Returns object of th state**/

	public Total_States close() {
		return close;
	}

	public Total_States suspend() {
		return suspend;
	}

	/*
	 * Purpose:Calls the operations from the current states and displays the
	 * current state
	 */
	public Total_States Check_pin() {
		return Check_pin;
	}
/*set s up login and setattmpts to 0*/
	public void login() {
		current_state_status.Login();
		GetShow_CurrentStatus();
		this.Total_attempts = 0;
	}

	public void IncorrectLogin() {
		current_state_status.IncorrectLogin();
		GetShow_CurrentStatus();
	}
/*returns the pin**/
	public Total_States GetSetpin() {
		return Check_pin;
	}

	public void CorrectPinBelowMin() {
		this.current_state_status.CorrectPinBelowMin();
		GetShow_CurrentStatus();
	}

	/*
	 * checks if pin above minimum
	 * */
	public void CorrectPinAboveMin() {
		this.current_state_status.CorrectPinAboveMin();
		GetShow_CurrentStatus();
	}
/*
 * deposits the amt
 * */
	public void deposit() {
		this.current_state_status.Deposit();
		GetShow_CurrentStatus();
	}
/*checks in balance is below min
 * */
	public void BelowMinBalance() {
		this.current_state_status.BelowMinBalance();
		GetShow_CurrentStatus();
	}
/*checks condition of min balance*/
	public void AboveMinBalance() {
		this.current_state_status.AboveMinBalance();
		GetShow_CurrentStatus();
	}
/*checks login attempts
 * */
	public void IncorrectLogin_Attempts(int prmtrials) {
		this.current_state_status.IncorrectPin(prmtrials);
		GetShow_CurrentStatus();
	}
/*Incorrect lock for wrong pin*/
	public void IncorrectLock() {
		this.current_state_status.IncorrectLock();
		GetShow_CurrentStatus();
	}
/*Incorrect unlock for wrong pin*/
	public void IncorrectUnlock() {
		this.current_state_status.IncorrectUnlock();
		GetShow_CurrentStatus();
	}

	public void Unlock() {
		this.current_state_status.Unlock();
		GetShow_CurrentStatus();
	}

	public void Suspended() {
		this.current_state_status.Suspend();
		GetShow_CurrentStatus();
	}

	public void Activated()
	{
		this.current_state_status.Activate();
		GetShow_CurrentStatus();
	}

	public void Balance() {
		this.current_state_status.Balance();
		GetShow_CurrentStatus();
	}

	public void WithdrawBelowMinBalance() {
		this.current_state_status.WithdrawBelowMinBalance();
		GetShow_CurrentStatus();
	}

	public void WithdrawAboveMinBalance() {
		this.current_state_status.WithdrawAboveMinBalance();
		GetShow_CurrentStatus();
	}

	public void Withdraw() {
		this.current_state_status.withdraw();
		GetShow_CurrentStatus();
	}

	public void Nofunds() {
		this.current_state_status.NoFunds();
		GetShow_CurrentStatus();
	}

	public void logout(){
		this.current_state_status.logout();
		GetShow_CurrentStatus();
	}

	public void Close()
	{
		this.current_state_status.Close();
		GetShow_CurrentStatus();

	}
	
	public void Locked(){
		this.current_state_status.Lock();
		GetShow_CurrentStatus();
		
	}
	public void withdraw2()
	{this.current_state_status.Withdraw2();
	GetShow_CurrentStatus();
		
	}
}
