package mda_efs_states;

import datastore.datastore_Account1;

public  class Ready extends Total_States {
	mda_efs objmdaefs = null;

	public Ready(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}
	/*log out of the system*/
	@Override
	public void logout() {
		this.objmdaefs.objoutput.Create_Log_out();
		this.objmdaefs.SetState(this.objmdaefs.idle);
		// TODO Auto-generated method stub

	}

/*Deposit the amt and stay in ready state*/
	@Override
	public void Deposit() {
		this.objmdaefs.objoutput.MakeDeposit();
		this.objmdaefs.SetState(this.objmdaefs.ready);
		// TODO Auto-generated method stub

	}
/*Display balance*/
	@Override
	public void Balance() {
		this.objmdaefs.objoutput.DisplayBalance();
	//S	((datastore_Account1) this.objdataStore).getbal()
		// TODO Auto-generated method stub

	}
/*Suspend the current state*/
	@Override
	public void Suspend() {
		this.objmdaefs.SetState(this.objmdaefs.suspend);
		// TODO Auto-generated method stub

	}
/*Go to lock state*/
	@Override
	public void Lock() {
		this.objmdaefs.SetState(this.objmdaefs.lock);
		// TODO Auto-generated method stub

	}

	@Override /*withdraw 1*/
	public void withdraw() {
		this.objmdaefs.objoutput.MakeWithdraw();
		this.objmdaefs.SetState(this.objmdaefs.s1);
		// TODO Auto-generated method stub

	}

	@Override/*no funds found*/
	public void NoFunds() {
		this.objmdaefs.SetState(this.objmdaefs.ready);
		this.objmdaefs.objoutput.No_FundsMsg();
		// TODO Auto-generated method stub

	}

/*with draw above minimum*/
	@Override
	public void WithdrawAboveMinBalance() {
//		this.objmdaefs.objoutput.MakeWithdraw();
		this.objmdaefs.SetState(this.objmdaefs.ready);
		// TODO Auto-generated method stub

	}

	

	@Override
	public void Withdraw2() {
		this.objmdaefs.objoutput.MakeWithdraw();
		this.objmdaefs.SetState(this.objmdaefs.ready);
		// TODO Auto-generated method stub
		
	}
}
