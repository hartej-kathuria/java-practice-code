class stack
{
		private int stck[];
		private int pos;
		
		public void fixedstack()
		{
			stck=new int[4];
			pos=-1;
		}

		public int push(final int data)
		{
			if(pos<3)
			{
				stck[++pos]=data;
				return 1;
			}
			return -1;
		}

		public int pop()
		{
			if(pos>-1)
			{
				return stck[pos--];
			}
			return -1;
		}		
}
 
class stackop
{
	public static void pushpopop()
	{

	stack stck1=new stack();
	stck1.fixedstack();
	assert(stck1.push(10) == 1);
	assert(stck1.push(20) == 1);
	assert(stck1.push(30) == 1);
	assert(stck1.push(40) == 1);
	assert(stck1.pop() == 40);
	assert(stck1.pop() == 30);
	assert(stck1.pop() == 20);
	assert(stck1.pop() == 10);
	}

	public static void main(String[] args)
	{
		pushpopop();
	}
} 
