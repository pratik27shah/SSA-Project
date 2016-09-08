package mda_efs_states;

public  class Overdrawn extends Total_States {
	mda_efs objmdaefs = null;

	public Overdrawn(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}


	@Override
	public void logout() {
		this.objmdaefs.objoutput.Create_Log_out();
		this.objmdaefs.SetState(this.objmdaefs.idle);
	}

	/*
	 * Purpose:If pin incorrect stay in over drawn state
	 */
	@Override
	public void IncorrectLock() {
		// TODO Auto-generated method stub
		this.objmdaefs.objoutput.Incorrect_lock();
		this.objmdaefs.SetState(this.objmdaefs.overdrawn);
	}
	public void locked() {
		this.objmdaefs.SetState(this.objmdaefs.lock);
		this.objmdaefs.Locked();
	}
	
	public void lock(){
		
		this.objmdaefs.SetState(this.objmdaefs.lock);
		this.objmdaefs.Locked();
	}


	@Override
	/*displays balance and stays over-drawn states*/
	public void Balance() {
		this.objmdaefs.objoutput.DisplayBalance();
		this.objmdaefs.SetState(this.objmdaefs.overdrawn);
		// TODO Auto-generated method stub

	}

	@Override
	
	/*Displaysvno fund message and staysvin overdrawn state*/
	public void withdraw() {
		// TODO Auto-generated method stub
		this.objmdaefs.objoutput.No_FundsMsg();
		this.objmdaefs.SetState(this.objmdaefs.overdrawn);
	}
	/*State remains in overddraawwn state*/
	@Override
	public void BelowMinBalance() {
		this.objmdaefs.SetState(this.objmdaefs.overdrawn);
		// TODO Auto-generated method stub

	}

}
