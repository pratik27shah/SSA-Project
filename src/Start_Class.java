import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mda_efs_states.mda_efs;
import output.output;
import Account_operations.ACCOUNT1;
import Account_operations.ACCOUNT2;
import abstract_factory.Concrete_Factory1;
import abstract_factory.Concrete_Factory2;

public class Start_Class {

	/**
	 * @param args
	 */
	/*
	 * Purpose:Starting point of the code,calls the other methods and
	 * classes,accepts user input
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(" Select ACCOUNT Machine (1 or 2) ");
			System.out.println("1. ACCOUNT-Machine-1");
			System.out.println("2. ACCOUNT-Machine-2");
			String input, pin, uid;
			float bal;
			int value, uid_i, bal_i, pin_i;
/*accept user input*/
			BufferedReader objbufferedReader = new BufferedReader(
					new InputStreamReader(System.in));
			input = objbufferedReader.readLine().toString().toLowerCase();
			
			
			if (Integer.parseInt(input) == 1) {
				Concrete_Factory1 objConcrete_Factory1 = new Concrete_Factory1();
			/*Create obejcts for ACCOUNT 1 of output,factory,mda_efs_ACCOUNT1*/
				output objoutput = new output(
						objConcrete_Factory1.Create_datastore(),
						objConcrete_Factory1);
				mda_efs objmdaefs = new mda_efs(objConcrete_Factory1, objoutput);
				ACCOUNT1 objACCOUNT1 = new ACCOUNT1(objmdaefs,
						objConcrete_Factory1.Create_datastore());
				
/***************************ACCOUNT-1***************************/
				while (true) {
					System.out.println("1. open (string p,string y,float a)");
					System.out.print("2. pin(string x)  ");
					System.out.print("3. deposit (float d)  ");
					System.out.println("4. withdraw (float w  )");
					System.out.print("5. balance()  ");
					System.out.print("6. login(string y)  ");
					System.out.println("7. logout()  ");
					System.out.print("8. lock(string x)  ");
					System.out.print("9. unlock(string x)  ");
					System.out.println("10. Quit  ");
					input = objbufferedReader.readLine();
					if (input.isEmpty()) {
						break;
					}
					value = Integer.parseInt(input);
					if (value == 1) { // open

						System.out.println("Open(pin,uid,bal)\nEnter pin");
						pin = objbufferedReader.readLine().toString();
						System.out.println("Enter uid");
						uid = objbufferedReader.readLine().toString();
						System.out.println("Enter bal");
						bal = Float.parseFloat(objbufferedReader.readLine());
						objACCOUNT1.open(pin, uid, bal);
					} else if (value == 2) {
						System.out.println("Enter Pin for ACCOUNT-1"); // pin
						objACCOUNT1.pin((objbufferedReader.readLine()));
					}

					else if (value == 3) {
						System.out.println("Enter Deposit amount for ACCOUNT-1"); // deposit
						objACCOUNT1.deposit(Float.parseFloat(objbufferedReader
								.readLine()));
					}

					

					else if (value == 4) {
						System.out.println("Enter Withdraw amount for ACCOUNT-1"); // with
						// draw
						objACCOUNT1.withdraw(Float.parseFloat(objbufferedReader
								.readLine()));
					}

					else if (value == 5) {
						System.out.println("Balance for ACCOUNT-1 ");
						objACCOUNT1.balance();
					} // balance

					else if (value == 6) {
						System.out.println("Enter UID for ACCOUNT-1"); // login
						objACCOUNT1.login((objbufferedReader.readLine()));
					}

					else if(value==7)
					{
						System.out.println("Log out from ACCOUNT-1");
						objACCOUNT1.logout();

					}
					else if (value == 8) {
						System.out.println("Enter pin for ACCOUNT-1"); // lock
						objACCOUNT1.lock((objbufferedReader.readLine()));
					}

					else if (value == 9) {
						System.out.println("Enter Pin for ACCOUNT-1");
						objACCOUNT1.unlock((objbufferedReader.readLine()));
					} // unlock

					else if (value == 10) {
						System.exit(0);
					} 


					else{System.out.println("Invalied Choice.Systems ends");
						break;}
				}
			}
/**ACCOUNT -2*/
			else if (Integer.parseInt(input) == 2) {
				/*Create obejcts for ACCOUNT 2 of output,factory,mda_efs_ACCOUNT2*/
				Concrete_Factory2 objConcrete_Factory2 = new Concrete_Factory2();
				// Output output = new Output(factory,factory.GetDataStore());
				output objoutput = new output(
						objConcrete_Factory2.Create_datastore(),
						objConcrete_Factory2);
				mda_efs objmdaefs = new mda_efs(objConcrete_Factory2, objoutput);
				ACCOUNT2 objACCOUNT2 = new ACCOUNT2(objmdaefs,
						objConcrete_Factory2.Create_datastore());
				// ACCOUNT1 ACCOUNT = new ACCOUNT1(mdaefsm,factory.GetDataStore());

				while (true) {
					System.out.println("1. open (int p,int y,int a)");
					System.out.print("2. pin(int x)  ");
					System.out.print("3. deposit (int d)  ");
					System.out.println("4. withdraw (int w  )");
					System.out.print("5. balance()  ");
					System.out.print("6. login(int y)  ");
					System.out.println("7. logout()  ");
					System.out.print("8. suspend()  ");
					System.out.print("9. activate()  ");
					System.out.println("10. close()  ");
					input = objbufferedReader.readLine();
					if (input.isEmpty()) {
						break;
					}
					value = Integer.parseInt(input);
					if (value == 1) { // open

						System.out.println("Open(pin,uid,bal)\nEnter pin");
						pin_i = Integer.parseInt(objbufferedReader.readLine());
						System.out.println("Enter uid");
						uid_i = Integer.parseInt(objbufferedReader.readLine());
						System.out.println("Enter bal");
						bal_i = Integer.parseInt(objbufferedReader.readLine());
						objACCOUNT2.open(pin_i, uid_i, bal_i);
					} else if (value == 2) { //pin
						System.out.println("Enter Pin for ACCOUNT-2");
						objACCOUNT2.pin(Integer.parseInt(objbufferedReader
								.readLine()));
					}

					else if (value == 3) {
						System.out.println("Enter Deposit amount for ACCOUNT-2"); // deposit
						objACCOUNT2.deposit((Integer.parseInt(objbufferedReader
								.readLine())));
					}
					
					else if (value == 5) {
						System.out.println("Balance for ACCOUNT-2");
						objACCOUNT2.balance();
					} // balance

					else if (value == 4) {
						System.out.println("ACCOUNT-2 Withdraw");
						objACCOUNT2.withdraw(Integer.parseInt(objbufferedReader
								.readLine()));
					} // withdraw

					else if (value == 6) { // login
						System.out.println("Enter UID for ACCOUNT-2");
						objACCOUNT2.login(Integer.parseInt(objbufferedReader
								.readLine()));
					}

					else if(value==7)  //log out
					{
						System.out.println("Log out from ACCOUNT-2");
						objACCOUNT2.logout();

					}

					else if (value == 8) {
						System.out.println("Suspended State ACCOUNT-2 "); // suspended
						objACCOUNT2.suspended();
					}

					else if (value==9){  //activated
						System.out.println("ACtivated State ACCOUNT-2 ");
						objACCOUNT2.activated();
					}

					else if (value==10){  //close
						System.out.println("ACtivated State ACCOUNT-2 ");
						objACCOUNT2.Close();
						System.exit(0);
					}
					else{System.out.println("Invalied Choice.Systems ends");
					break;}
				}
			}

		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
