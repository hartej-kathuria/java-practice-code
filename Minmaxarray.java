class Minmaxarray
{   
	public static int Min(int a[])
	{
		int min;
		min=a[0];
		for(int i=0;i<4;i++)
		{
			if (min>a[i])
				min=a[i];
		}
		return min;
	}

	public static int Max(int a[])
	{
		int max=a[0];
		for(int j=0;j<4;j++)
		{
			if (max<a[j])
				max=a[j];
		}
		return max;
	}

	
	public static void main(String[] args)
	{
		int a[]=new int[4];
		int min,max;
	    a[0]=2;
	    a[1]=3;
	    a[2]=1;
	    a[3]=4;
	    int b,c;
	    min = Min(a);
	    max = Max(a);
	    assert(min==1);
	    assert(max==4);
	    System.out.println("MInimum"+min);
	    System.out.println("Maximum"+max);
    }
}