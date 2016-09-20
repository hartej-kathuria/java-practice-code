class Square
{
	static int Square(int data)
    {
    	int sq;
    	sq= data*data;
    	return sq;
    }

    public static void main(String[] args)
    {
    	int num=4;
    	int sq=Square(num);
    	assert(sq == 16);
    	System.out.println(sq);
    }
}

