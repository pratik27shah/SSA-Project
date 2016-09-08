package mda_efs_states;

import mda_efs_states.*;

public   class Idle extends Total_States {
	mda_efs objmda_efs = null;

	public Idle(mda_efs objmda_efs) {
		this.objmda_efs = objmda_efs;
	}
/*Gets prompt for pin and comapres with current pin
 * */
	@Override
	public void Login() {
		this.objmda_efs.objoutput.PromptForPin();
		this.objmda_efs.SetState(this.objmda_efs.GetSetpin());

		// TODO Auto-generated method stub

	}

	@Override
	/*displays incorrect id message*/
	public void IncorrectLogin() {
		this.objmda_efs.objoutput.DisplayIncorrectIDMsg();
		// TODO Auto-generated method stub

	}

}