package startegy;

import datastore.*;

public class Display_uid_Account1 extends Display_uid {
	public void Display_uid(datastore objdDatastore) {
		System.out.println("uid for Account 1-->"
				+ ((datastore_Account1) objdDatastore).getuid());
	}

}
