class Reverseno
{
	public static void main(String[] args)
	{
		int n,i;
		n=12345;
		while(n!=0)
		{
			i=n%10;
			System.out.print(i);
			n=n/10;
		}
		System.out.println();
	}
}