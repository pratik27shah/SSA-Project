package startegy;

import datastore.*;

public class penalty_Account1 extends penalty {
	public void penalty(datastore objdatastore) {
		((datastore_Account1) objdatastore).Set_Penalty();
		System.out.println("Account-1..new balance"
				+ ((datastore_Account1) objdatastore).getbal());

	}

}
