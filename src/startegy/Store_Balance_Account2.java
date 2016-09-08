package startegy;

import datastore.*;

public class Store_Balance_Account2 extends Store_Balance {
	public void Store_Balance(datastore objdatastore) {
		((datastore_Account2) objdatastore).Setbal();
		System.out.println("Atm-2.Store Balance"
				+ ((datastore_Account2) objdatastore).getbal());

	}

}
