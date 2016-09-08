package startegy;

import datastore.*;

public class Display_Pin_Account2 extends Display_Pin {
	public void Display_Pin(datastore objdDatastore) {
		System.out.println("Pin for Account 2-->"
				+ ((datastore_Account2) objdDatastore).Getpin());
	}
}
