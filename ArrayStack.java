import  java.util.ArrayList;
class ArrayStack
{
	ArrayList stack=new ArrayList();
	int elements[]=new int[10];
	int top()
	{
		int last_index=0;
		last_index=elements.length-1;
		return elements[last_index];
	}
	int empty()
	{
		if (elements.length==0)
			return 0;
		else
			return -1;
	}

	void push(int e)
	{
		stack.add(e);
	}	

	int pop()
	{
		return 0;
	}

}	
