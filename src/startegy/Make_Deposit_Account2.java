package startegy;

import datastore.*;

public class Make_Deposit_Account2 extends Make_Deposit {
	public void Make_Deposit(datastore objdatastore) {
		((datastore_Account2) objdatastore).setdeposit();
		((datastore_Account2) objdatastore).compute_balance();
		System.out.println("Account2--Deposit"
				+ ((datastore_Account2) objdatastore).getdeposit());
	}
}
