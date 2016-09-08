package startegy;

import datastore.*;

public class Display_uid_Account2 extends Display_uid {
	public void Display_uid(datastore objdDatastore) {
		System.out.println("Pin for Account 2->"
				+ ((datastore_Account2) objdDatastore).Getpin());
	}

}
