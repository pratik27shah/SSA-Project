package startegy;

import datastore.*;

public class Store_uid_Account2 extends Store_uid {
	public void Store_uid(datastore objdatastore) {
		((datastore_Account2) objdatastore).Setuid();
		System.out.println("Atm 2 id-->"
				+ ((datastore_Account2) objdatastore).getuid());
	}
}
