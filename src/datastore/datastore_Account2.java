package datastore;

public class datastore_Account2 extends datastore {
	/* Pemrmanent variable storage */
	public int pin;
	public int uid;
	public int bal;
	public int deposit;
	public int withdraw;

	/* temporary storage */
	public int temp_pin;
	public int temp_uid;
	public int temp_bal;
	public int temp_deposit;
	public int temp_withdraw;
	/*Purpose:Set the pin from temp variable
	 * 
	 * */
	public int Setpin() {
		this.pin = this.temp_pin;
		return this.pin;

	}
/*
Purpose:Set the uid 
*/
	public int Setuid() {
		this.uid = this.temp_uid;
		return this.uid;
	}
/*Set the balance value*/
	public int Setbal() {
		this.bal = this.temp_bal;
		return this.bal;
	}
/*gets the balance value in int*/
	public int getbal() {
		return this.bal;
	}
/*Gets the value of pin*/
	public int Getpin() {
		return this.pin;
	}
/*Gets the uid in int format*/
	public int getuid() {
		return this.uid;
	}
/*Sets the deposit value*/
	public int setdeposit() {
		this.deposit = this.temp_deposit;
		return this.deposit;
	}
/*Purpose:Returns the deposit in int
 * 
 * */
	public int getdeposit() {
		return this.deposit;
	}
	/*Calculates the bal=bal+deposit*/
	public int compute_balance() {
		this.bal = this.bal + this.deposit;
		return this.bal;
	}
	/*Purpose:Sets the withdraw value*/
	public int Set_withdraw() {
		this.withdraw = this.temp_withdraw;
		return this.withdraw;
	}
	/*Purpose:REduces the balance after amount .withdraw*/
	public int reduce_balance() {
		this.bal = this.bal - this.withdraw;
		return this.bal;
	}

	
}
