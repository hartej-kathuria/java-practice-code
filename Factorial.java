class Factorial
{
	public static void main(String[] args)
	{
		int n,fac;
		fac=1;
		for(n=5;n>0;n--)
		{
			fac=fac*n;
		}
		assert(fac==121);
}
}