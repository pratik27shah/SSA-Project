package startegy;

import datastore.*;

public class Display_Pin_Account1 extends Display_Pin {
	public void Display_Pin(datastore objdDatastore) {
		System.out.println("Pin for Account 1-->"
				+ ((datastore_Account1) objdDatastore).Getpin());
	}

}
