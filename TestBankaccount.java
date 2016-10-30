class TestBankaccount extends Bankaccount
{
	public static void main(String[] args)
	{
		Bankaccount account=new Bankaccount();
		account.accountdetails("XYZ",12367,"Savings",1000);
		account.balanceip(2000);
		account.withdraw(1000);
		//account.printdetails();
	}

}
