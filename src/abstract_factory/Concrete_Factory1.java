package abstract_factory;

import startegy.*;

import datastore.*;

/*
 * Purpose:Concrete factory class to return objects of the methods of strategy classes
 * 
 * 
 * */
public class Concrete_Factory1 implements abstract1 {
	Incorrect_Pin_msg incorrect_pin = new Incorrect_Pin_msg_Account1();
	datastore objdatastore = new datastore_Account1();
	Prompt_for_Pin objPrompt_for_Pin = new Prompt_for_Pin_Account1();
	Too_many_Attempts objCreateTooManyAttemptsMsg = new Too_many_Attempts_Account1();
	DisplayMenu objDisplayMenu = new DisplayMenu_Account1();
	Store_pin objStore_pin = new Store_pin_Account1();
	Store_Balance objStore_Balance = new Store_Balance_Account1();
	Store_uid objStore_uid = new Store_uid_Account1();
	Display_Balance objDisplay_Balance = new Display_Balance_account1();
	Make_Deposit objMake_Deposit = new Make_Deposit_Account1();
	Make_Withdrawn objMake_Withdrawn = new Make_Withdrawn_Account1();

	Display_Pin objDisplay_Pin = new Display_Pin_Account1();
	Display_uid objDisplay_uid = new Display_uid_Account1();
	Incorrect_Id_message objIncorrect_Id_message = new Incorrect_Id_msg_Account1();
	No_Fund_message objNo_funds = new No_Fund_message_Account1();
	Incorrect_unlock_msg objIncorrect_unlock_msg = new Incorrect_unlock_msg_Account1();
	Incorrect_lock objIncorrect_lock = new Incorrect_lock_Account1();
	penalty objpPenalty = new penalty_Account1();
	Log_out objLog_out=new Log_out_Account1();
	/*returns obj to display log out message*/
	public Log_out Create_Log_out()
	{
		return this.objLog_out;
		
	}
/*
 * returns object to compute penalty
 * */
	public penalty Apply_Penalty() {
		return this.objpPenalty;
	}
/*returns object of incorrect lock*/
	public Incorrect_lock Create_Incorrect_lock() {
		return this.objIncorrect_lock;
	}
/*Purpose:returns object of Display incorrect message to unlock */
	public Incorrect_unlock_msg Create_Incorrect_unlock_msg() {
		return this.objIncorrect_unlock_msg;

	}
/*Purpose:returns object that no funds present*/
	public No_Fund_message Create_No_fund_msg() {

		return this.objNo_funds;
	}
/*Purpose:returns object of Incorrect pin mg */
	public Incorrect_Pin_msg Create_Incorrect_Pin_msg() {
		return this.incorrect_pin;

	}
/*Purpose:returns obj of the datastore
 * 
 **/
	public datastore Create_datastore() {
		return this.objdatastore;
	}
	/*Purpose:returns obj asking for pin
	 * 
	 **/
	public Prompt_for_Pin CreatePromptForPin() {
		return this.objPrompt_for_Pin;
	}
	/*Purpose:returns obj to display too many attempts message
	 * 
	 **/
	public Too_many_Attempts CreateTooManyAttemptsMsg() {
		return this.objCreateTooManyAttemptsMsg;
	}
	/*Purpose:returns obj to display menu
	 * 
	 **/
	public DisplayMenu CreateDisplayMenu() {
		return this.objDisplayMenu;
	}/*Purpose:returns obj to store pin
	 * 
	 **/

	public Store_pin CreateStorePin() {
		return this.objStore_pin;
	}
	/*Purpose:returns obj to display menu
	 * 
	 **/
	public Store_Balance CreateStoreBalance() {
		return this.objStore_Balance;
	}
	/*Purpose:returns obj to store pin  
	 * 
	 **/
	public Store_uid CreateStoreUid() {
		return this.objStore_uid;
	}
	/*Purpose:returns obj to store balance
	 * 
	 **/
	public Display_Balance CreateDisplayBalance() {
		return this.objDisplay_Balance;
	}
	/*Purpose:returns obj to make deposits
	 * 
	 **/
	public Make_Deposit CreateMakeDeposit() {
		return this.objMake_Deposit;
	}
	/*Purpose:returns obj to mke withdraw
	 * 
	 **/
	public Make_Withdrawn CreateMakeWithdraw() {
		return this.objMake_Withdrawn;
	}
	/*Purpose:returns obj to display pin
	 * 
	 **/
	public Display_Pin CreateDisplay_pin() {
		return this.objDisplay_Pin;
	}
	/*Purpose:returns obj to display uid
	 * 
	 **/
	public Display_uid CreateDisplay_uid() {
		return this.objDisplay_uid;
	}
/*Purpose:returns obj of incorrect id msg*/
	public Incorrect_Id_message Create_Incorrect_Id_msg() {
		// TODO Auto-generated method stub
		return this.objIncorrect_Id_message;
	}


}
