class Expression
{
	public static void main(String[] args)
	{
		int a,b,c;
		double x,y;
		a=1;
		b=-5;
		c=6;
		x=Math.sqrt(b*b-4*a*c);
		y=(-b+x)/2*a;
		assert(y==4);
	}
}