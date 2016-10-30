class Bankaccount
{
	String name;
	int accountno;
	String account_type;
	int balance;

	void accountdetails(String name,int accountno,String account_type,int balance)
	{
		this.name=name;
		this.accountno=accountno;
		this.account_type=account_type;
		this.balance=balance;
	}

	void balanceip(int balance)
	{
		this.balance=this.balance+balance;
		assert(this.balance==3000);
	}

	void withdraw(int wa)
	{
		this.balance=this.balance-wa;
		//System.out.println(this.balance);
		assert(this.balance==2000);
	}

	void printdetails()
	{
		System.out.println("Name of account holder"+this.name);
		System.out.println("Balance in the account"+this.balance);
	}

}