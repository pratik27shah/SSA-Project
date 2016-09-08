package startegy;

import datastore.*;

public class Make_Withdrawn_Account1 extends Make_Withdrawn {
	public void Make_Withdrawn(datastore objdatastore) {
		((datastore_Account1) objdatastore).Set_withdraw();
		((datastore_Account1) objdatastore).reduce_balance();
		System.out.println("Account-1..Balance is "
				+ ((datastore_Account1) objdatastore).getbal());
	}
}
