package startegy;

import datastore.*;

public class Display_Balance_account2 extends Display_Balance {
	public void Display_Balance(datastore objdatastore) {
		System.out.println("Account 2..balance is"
				+ ((datastore_Account2) objdatastore).getbal());

	}
}
