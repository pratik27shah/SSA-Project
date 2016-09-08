package startegy;

import datastore.*;

public class Display_Balance_account1 extends Display_Balance {
	public void Display_Balance(datastore objdatastore) {
		System.out.println("Account 1..balance is"
				+ ((datastore_Account1) objdatastore).getbal());

	}
}
