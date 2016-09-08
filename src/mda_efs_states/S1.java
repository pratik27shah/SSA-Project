package mda_efs_states;

public  class S1 extends Total_States {
	mda_efs objmdaefs = null;

	public S1(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		this.objmdaefs.objoutput.MakeWithdraw();
	}

	@Override
	public void NoFunds() {
		// TODO Auto-generated method stub

	}

	@Override
	/*
	 * Go to overdrawn state if more amount cannot be withdrawed *
	 */
	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		this.objmdaefs.objoutput.Penalty();
		this.objmdaefs.SetState(this.objmdaefs.overdrawn);
	}

	/*Purpose:Stays in ready state*/
	@Override
	public void AboveMinBalance() {
		this.objmdaefs.SetState(this.objmdaefs.ready());
		// TODO Auto-generated method stub

	}
/*Purpose Stays in overdraawn state*/
	@Override
	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		this.objmdaefs.SetState(this.objmdaefs.overdrawn());
	}


	@Override
	/*
	 * Purpose:Calculate the with draw and update new balance
	 */
	public void WithdrawAboveMinBalance() {

		this.objmdaefs.SetState(this.objmdaefs.ready);
		// TODO Auto-generated method stub

	}


}
