package output;

import abstract_factory.*;
import startegy.*;

import datastore.*;
/*Purpose:Get and Set Output
 * 
 * */
public class output {
	abstract1 objfactory = null;
	datastore objDatastore = null;

	public output(datastore objDatastore, abstract1 objfactory) {
		this.objfactory = objfactory;
		this.objDatastore = objDatastore;

	}

	/*
	 * Purpose:Abstract factory call to incorrect pin message.
	 */
	public void Incorrect_Pin_msg() {
		System.out.println("\n Output:Action--> Incorrect_Pin_Msg");
		Incorrect_Pin_msg incorrect_pin = objfactory.Create_Incorrect_Pin_msg();
		incorrect_pin.Incorrect_Pin_msg();

	}
/*Purpose:Calls for incorrect lock message
 * 
 * */
	public void Incorrect_lock() {
		Incorrect_lock objincorrect = objfactory.Create_Incorrect_lock();
		objincorrect.Incorrect_lock();
	}
/*Purpose:Calls Incorrect lock has to be unlock message
 * 
 * */
	public void Incorrect_unlock_msg() {
		Incorrect_unlock_msg objincorrect = objfactory
				.Create_Incorrect_unlock_msg();
		objincorrect.Incorrect_unlock_msg();

	}
	
	/* Purpose:Prompts to user for Pin
	 * 
	
	*/

	public void PromptForPin() {
		System.out.println("\n Output:Action--> Create Prompt For Pin");
		Prompt_for_Pin create_prompt = objfactory.CreatePromptForPin();
		create_prompt.Prompt_for_Pin();
	}
/*Purpose:Calls strategy for too many attempts
 * 
 * */
	public void TooManyAttemptsMsg() {
		System.out.println("\n Output:Action--> Too Many Attempt sMsg");
		Too_many_Attempts toomanyattempts = objfactory
				.CreateTooManyAttemptsMsg();
		toomanyattempts.Too_many_Attempts();
	}
/*Purpose:Display the menu with associated messges to the userr
 * 
 * */
	public void DisplayMenu() {
		System.out.println("\n Output:Action--> Display Menu");
		DisplayMenu displaymenu = objfactory.CreateDisplayMenu();
		displaymenu.DisplayMenu();
	}
/*Purpose:Store the user pin
 * 
 * */
	public void StorePin() {
		System.out.println("\n Output:Action--> Store Pin");
		Store_pin storepin = objfactory.CreateStorePin();
		storepin.Store_pin(objDatastore);

	}
/*
 * Purpose:Store the balance 
 * */
	public void StoreBalance() {
		System.out.println("\n Output:Action--> Store Balance");
		Store_Balance storebalance = objfactory.CreateStoreBalance();
		storebalance.Store_Balance(objDatastore);

	}
/*Purpose:Store the uid by calling the factory packages* 
 * */
	public void StoreUid() {
		System.out.println("\n Output:Action-->  Store Uid");
		Store_uid storeuid = objfactory.CreateStoreUid();
		storeuid.Store_uid(objDatastore);

	}

	public void DisplayBalance() {
		System.out.println("\n Output:Action--> Display Balance");
		Display_Balance displaybalance = objfactory.CreateDisplayBalance();
		displaybalance.Display_Balance(objDatastore);
	}

	/*Purpose:Make deposit of amt and compute new balance
	 * 
	 * */
	public void MakeDeposit() {
		System.out.println("\n Output:Action--> Make Deposit");
		Make_Deposit makedeposit = objfactory.CreateMakeDeposit();
		makedeposit.Make_Deposit(objDatastore);
	}
/**
 * Purpose:MAke the withdraw and reduce the balacne
 * */
	public void MakeWithdraw() {
		System.out.println("\n Output:Action--> Make Withdraw");
		Make_Withdrawn makewithdraw = objfactory.CreateMakeWithdraw();
		makewithdraw.Make_Withdrawn(objDatastore);
	}/*
	Dispaly uid 
	*/

	public void Displayuid() {
		System.out.println("Output:Action--->UID");
		Display_uid objdisplaypin = objfactory.CreateDisplay_uid();
		objdisplaypin.Display_uid(objDatastore);

	}

	/*Purpose:Display Incorrect ID messsage
	 * 
	 * */
	public void DisplayIncorrectIDMsg() {
		System.out.println("Output:Action--->UID");
		Incorrect_Id_message objdisplaypin = objfactory
				.Create_Incorrect_Id_msg();
		objdisplaypin.Incorrect_Id_message();

	}
	
	/*Purpose:Display usser entered pin	 * 
	 * */

	public void Displaypin() {
		System.out.println("Output:Action--->Pin");
		Display_Pin objdisplaypin = objfactory.CreateDisplay_pin();
		objdisplaypin.Display_Pin(objDatastore);
	}
/*Purpose:Display no fund message
 * 
 * */
	public void No_FundsMsg() {
		No_Fund_message objnofunds = objfactory.Create_No_fund_msg();
		objnofunds.No_Fund_message();
	}

	/*Purpose:calculates penalty for with drawn cases
	 * 
	 * */
	public void Penalty() {
		System.out.println("Output:Action--->Penalty Applied");
		penalty objpenalty = objfactory.Apply_Penalty();
		objpenalty.penalty(objDatastore);

	}
	
	/*Purpose:logs out to idle state
	 * 
	 * */
	public void  Create_Log_out()
	{
		System.out.println("Output Action--->Log Out");
		Log_out objLog_out=objfactory.Create_Log_out();
		objLog_out.Log_out();
		
	}
}
