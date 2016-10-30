class Factorial
{
	public static void main(String[] args)
	{
		int n,fac;
		fac=1;
		for(n=100;n>0;n--)
		{
			fac=fac*n;
		}
		System.out.println(fac);
		//assert(fac==121);
	}
}
//to give execption or test the code for a limit of number