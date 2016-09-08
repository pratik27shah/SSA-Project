package startegy;

import datastore.*;

public class Make_Deposit_Account1 extends Make_Deposit {
	public void Make_Deposit(datastore objdatastore) {
		((datastore_Account1) objdatastore).setdeposit();
		((datastore_Account1) objdatastore).compute_balance();
		System.out.println("Account 1--Deposit"
				+ ((datastore_Account1) objdatastore).getdeposit());
	}
}
