package abstract_factory;

import startegy.*;
import datastore.*;

/* 
 Purpose:Interfaces to create the abstract class,consit of all the operations
 **/
public interface abstract1 {
	public Incorrect_Pin_msg Create_Incorrect_Pin_msg();

	public datastore Create_datastore();

	public Prompt_for_Pin CreatePromptForPin();

	public Too_many_Attempts CreateTooManyAttemptsMsg();

	public DisplayMenu CreateDisplayMenu();

	public Store_pin CreateStorePin();

	public Store_Balance CreateStoreBalance();

	public Store_uid CreateStoreUid();

	public Display_Balance CreateDisplayBalance();

	public Make_Deposit CreateMakeDeposit();

	public Make_Withdrawn CreateMakeWithdraw();

	public Display_Pin CreateDisplay_pin();

	public Display_uid CreateDisplay_uid();

	public Incorrect_Id_message Create_Incorrect_Id_msg();

	public No_Fund_message Create_No_fund_msg();

	public Incorrect_unlock_msg Create_Incorrect_unlock_msg();

	public Incorrect_lock Create_Incorrect_lock();

	public penalty Apply_Penalty();
	
	public Log_out Create_Log_out();
}
