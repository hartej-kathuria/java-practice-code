class Centroid
{
	public static void main(String[] args)
	{
	int xcor[]=new int[3];
	int ycor[]=new int[3];
	int xcen,ycen;
	for(int i=0; i<3; i++)
	{
		xcor[i]=1;
		ycor[i]=2;
	}
	xcen=(xcor[0]+xcor[1]+xcor[2])/3;
	ycen=(ycor[0]+ycor[1]+ycor[2])/3;
	assert(xcen==1);
	assert(ycen==3);
    }

}