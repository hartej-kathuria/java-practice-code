class Alphabeticstring
{
	public static void main( String[] args )
	{
		int ascii[] = new int[2];
		char charc[]= new char[2];
		for(int i=0;i<args.length;i++)
		{
			charc[i] =args[i].charAt(0);
			System.out.print(charc[i]);
		}
			System.out.println();	
	}

}