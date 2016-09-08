package startegy;

import datastore.*;

public class Store_pin_Account2 extends Store_pin {
	public void Store_pin(datastore objdatastore) {
		((datastore_Account2) objdatastore).Setpin();
		System.out.println("Atm 2--Store pin"
				+ ((datastore_Account2) objdatastore).Getpin());
	}
}
