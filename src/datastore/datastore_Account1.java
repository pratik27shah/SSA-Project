package datastore;

public class datastore_Account1 extends datastore {
	/* Pemrmanent variable storage */
	public String pin;
	public String uid;
	public Float bal;
	public Float deposit;
	public Float withdraw;

	/* temporary storage */
	public String temp_pin;
	public String temp_uid;
	public Float temp_bal;
	public Float temp_deposit;
	public Float temp_withdraw;
/*Purpose:Set the pin from temp variable
 * 
 * */
	public String Setpin() {
		this.pin = this.temp_pin;
		return this.pin;

	}/*
	Purpose:Set the uid 
	*/

	public String Setuid() {
		this.uid = this.temp_uid;
		return this.uid;

	}
/*
 * Purpose:Set the balance value
 * */
	public Float Setbal() {
		this.bal = this.temp_bal;

		return this.bal;
	}
/*
 * Purpose:Returns the correct balance value
 * */
	public Float getbal() {
		return this.bal;
	}
/*Purpose:Gts the value of pin*/

	public String Getpin() {
		return this.pin;

	}
/*Purpose:Gets the uid
 * */
	public String getuid() {
		return this.uid;
	}
/*Purpose:Sets the deposit*/
	public float setdeposit() {
		this.deposit = this.temp_deposit;
		return this.deposit;
	}
/*Purpose:Returns the deposit
 * 
 * */
	public float getdeposit() {
		return this.deposit;
	}
	/*Calculates the bal=bal+deposit*/
	public float compute_balance() {
		this.bal = this.bal + this.deposit;
		return this.bal;
	}
/*Purpose:Sets the withdraw value*/
	public float Set_withdraw() {
		this.withdraw = this.temp_withdraw;
		return this.withdraw;
	}
/*Purpose:REduces the balance after amount .withdraw*/
	public float reduce_balance() {
		this.bal = this.bal - this.withdraw;
		return this.bal;
	}
/*Purpose:Reduces bal by 20 as penalty imposed*/
	public float Set_Penalty() {
		this.bal = this.bal - 20;
		return this.bal;
	}

}
