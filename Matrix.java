class matrix
{
	private final int d[][]=  new int[2][2];
	
	int[][] fillop(final int data)
	{
		System.out.println("Inside fillop:"+data);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				this.d[i][j]=data;
				System.out.println("d value"+d[i][j]);
			}
		}

		return d;
	}

	int[][] addop(int a[][],int b[][])
	{
		int c[][]=new int [2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}	