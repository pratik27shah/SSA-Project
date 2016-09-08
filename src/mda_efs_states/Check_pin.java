package mda_efs_states;

public  class Check_pin extends Total_States {
	mda_efs objmdaefs = null;

	public Check_pin(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}

	/*
	 * Purpose:Changes states when the pin is wrong or the max attempt has
	 * exceeded
	 */
	@Override
	public void IncorrectPin(int max) {
		if (this.objmdaefs.Total_attempts < max) {
			this.objmdaefs.Total_attempts++;
			this.objmdaefs.objoutput.Incorrect_Pin_msg();
			this.objmdaefs.SetState(this.objmdaefs.Check_pin());
		}
		if (this.objmdaefs.Total_attempts >= max) {
			
			this.objmdaefs.Total_attempts++;
			this.objmdaefs.objoutput.TooManyAttemptsMsg();
			this.objmdaefs.SetState(this.objmdaefs.idle());
		}
		// TODO Auto-generated method stub

	}

	@Override
	/*logs out and goes to idle state*/
	public void logout() {
		this.objmdaefs.objoutput.Create_Log_out();
		this.objmdaefs.SetState(this.objmdaefs.idle);
		// TODO Auto-generated method stub

	}

/*Display menu and goes  to ready state*/
	public void CorrectPinAboveMin() {
		this.objmdaefs.objoutput.DisplayMenu();
		this.objmdaefs.SetState(this.objmdaefs.ready);
		// TODO Auto-generated method stub

	}
	/*Display menu and goes  to overdrawn state*/
	@Override
	public void CorrectPinBelowMin() {
		
		this.objmdaefs.objoutput.DisplayMenu();
		this.objmdaefs.SetState(this.objmdaefs.overdrawn());
		// TODO Auto-generated method stub

	}

}
