package startegy;

import datastore.*;

public class Store_uid_Account1 extends Store_uid {
	public void Store_uid(datastore objdatastore) {
		((datastore_Account1) objdatastore).Setuid();
		System.out.println("Atm 1 id-->"
				+ ((datastore_Account1) objdatastore).getuid());
	}
}
