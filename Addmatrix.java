class Addmatrix extends matrix
{
		
		
		public static void main(String[] args)
	{
		int a[][]= new int[2][2];
		static int b[][]=new int[2][2];
		int c[][]= new int[2][2];
		
		matrix obj =new matrix();
		b=obj.fillop(2);
		a = obj.fillop(1);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.println("Avalue:"+a[i][j]);
				System.out.println("Bvalue:"+b[i][j]);

				
			}
		}
		c=obj.addop(a,b);

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Cvalue:"+c[i][j]);

				System.out.println("Bvalue:"+b[i][j]);

				System.out.println("Avalue:"+a[i][j]);
			}
		}
	}
}