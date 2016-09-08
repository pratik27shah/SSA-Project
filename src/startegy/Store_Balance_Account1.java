package startegy;

import datastore.*;

public class Store_Balance_Account1 extends Store_Balance {
	public void Store_Balance(datastore objdatastore) {
		((datastore_Account1) objdatastore).Setbal();
		System.out.println("Atm-1.Store Balance"
				+ ((datastore_Account1) objdatastore).getbal());

	}

}
