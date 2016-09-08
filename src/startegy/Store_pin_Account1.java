package startegy;

import datastore.*;

public class Store_pin_Account1 extends Store_pin {
	public void Store_pin(datastore objdatastore) {
		((datastore_Account1) objdatastore).Setpin();
		System.out.println("Atm 1--Store pin"
				+ ((datastore_Account1) objdatastore).Getpin());
	}
}
