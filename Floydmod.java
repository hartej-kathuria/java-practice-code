class Floydmod
{
	public static void main(String[] args)
	{
		int i,j;
		int k=1;
		for(i=1;i<=13;i++)
		{
			if(i%2==0)
				k=0;
			else
				k=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				if(k==1)
					k=0;
				else
					k=1;
			}
			System.out.println();
		}		

	}
}