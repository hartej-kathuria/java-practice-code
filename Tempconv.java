class Tempconv
{
	public static void main(String[] args)
	{
		int C,F;
		F=Integer.parseInt(args[0]);
		C=(F-32)*5/9;
		System.out.println("Temperature in celcius="+C+" degrees");
	}
}
