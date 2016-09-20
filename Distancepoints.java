class Distancepoints
{
 	public static void main(String[] args)
 	{
 		double x[]= new double[2];
 		double y[]= new double[2];
 		x[0]=1;
 		x[1]=2;
 		y[0]=3;
 		y[1]=4;
 		double d1=Math.pow((x[1]=x[0]),2)+Math.pow((y[1]-y[0]),2);
 		double d= Math.sqrt(d1);
 		System.out.println(d);

 	}	
}