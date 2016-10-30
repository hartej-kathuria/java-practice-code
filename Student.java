class Student
{
	int rollnumber;
	void getrollnumber(int n)
	{
		this.rollnumber=n; 
	}
	int printrollnumber()
	{
		return this.rollnumber;
	}
}

class Test extends Student
{
	int test[]=new int[2];
	void getnumbers(int test1,int test2)
	{
		this.test[0]=test1;
		this.test[1]=test2;
	}
	int[] printtestnumber()
	{
		return test;
	}
}

class Result extends Test
{
	int totaltest;
	int printtotal()
	{
		this.totaltest=this.test[0]+this.test[1];
		return this.totaltest;
	}
}
