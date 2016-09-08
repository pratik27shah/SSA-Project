package mda_efs_states;

public  class locked extends Total_States {
	mda_efs objmdaefs = null;

	public locked(mda_efs objmdaefs) {
		this.objmdaefs = objmdaefs;
	}
	/*Purpose:Sets state to lock state
	
	**/
	public void IncorrectLock() {
		this.objmdaefs.SetState(this.objmdaefs.lock);
this.objmdaefs.objoutput.Incorrect_unlock_msg();
		// TODO Auto-generated method stub

	}
	/*sets state to s1*/
public void Unlock(){
	this.objmdaefs.SetState(this.objmdaefs.s1);
	
}

}
