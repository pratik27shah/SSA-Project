package startegy;

import datastore.*;

public class Make_Withdrawn_Account2 extends Make_Withdrawn {
	public void Make_Withdrawn(datastore objdatastore) {
		((datastore_Account2) objdatastore).Set_withdraw();
		((datastore_Account2) objdatastore).reduce_balance();
		System.out.println("Account-1..Balance is "
				+ ((datastore_Account2) objdatastore).getbal());
	}
}
