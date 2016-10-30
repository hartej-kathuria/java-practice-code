class TestStudent extends Result
{
	public static void main(String[] args)
	{
		Result studentname=new Result();
		studentname.getrollnumber(21);
		studentname.getnumbers(43,55);
		assert(studentname.printtotal()==98);
	}
}