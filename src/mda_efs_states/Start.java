package mda_efs_states;

import mda_efs_states.*;

public  class Start extends Total_States {
	mda_efs objmdaefs = null;

	public Start(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}
/*purpose:Store pin,bal,and uid */
	@Override
	public void Open() {
		System.out.println("In Open State");
		this.objmdaefs.objoutput.StorePin();
		this.objmdaefs.objoutput.StoreBalance();
		this.objmdaefs.objoutput.StoreUid();

		// this.objmdaefs.objoutput.DisplayBalance();
		// this.objmdaefs.objoutput.Displayuid();
		// this.objmdaefs.objoutput.Displaypin();
		Total_States temp_State = this.objmdaefs.idle();
		(this.objmdaefs).SetState(temp_State);

	}

}
