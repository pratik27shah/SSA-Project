package mda_efs_states;

public  class suspended extends Total_States {
	mda_efs objmdaefs = null;

	public suspended(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}
	/*
	 * Purpose:Display the current balance
	 */
	public void Balance() {
		// TODO Auto-generated method stub
		this.objmdaefs.objoutput.DisplayBalance();

	}
	public void Activate() {
		this.objmdaefs.SetState(this.objmdaefs.ready);
	}

	// TODO Auto-generated method stub

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		this.objmdaefs.SetState(this.objmdaefs.close);
	}
}