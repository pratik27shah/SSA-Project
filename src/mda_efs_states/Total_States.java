package mda_efs_states;


/*Purpose:Consist of all the states implemnted as interfaces
 * 
 * */
public  class Total_States {
	public  void Open(){};

	public  void Login(){};

	public  void IncorrectLogin(){};

	public  void IncorrectPin(int max){};

	public  void logout(){};

	public  void CorrectPinAboveMin(){};

	public  void CorrectPinBelowMin(){};

	public  void IncorrectLock(){};

	public  void Deposit(){};

	public  void Balance(){};

	public  void Suspend(){};

	public  void Lock(){};

	public  void withdraw(){};

	public  void NoFunds(){};

	public  void WithdrawBelowMinBalance(){};

	public  void AboveMinBalance(){};

	public  void BelowMinBalance(){};

	public  void Unlock(){};

	public   void IncorrectUnlock(){};

	public  void Activate(){};

	public  void Close(){};

	public  void WithdrawAboveMinBalance(){};
	
	// public  void Logout(){};
	 
	 public  void Withdraw2(){};

}
