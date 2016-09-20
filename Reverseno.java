class Reverseno
{
	public static void main(String[] args)
	{
		int i;
		int n=0;

		n=Integer.parseInt(args[0]);
		while(n!=0)
		{
			i=n%10;
			System.out.print(i);
			n=n/10;
		}
		System.out.println();
	}
}