import java.util.Scanner;
class Answerques
{
	public static void main(String[] args)
	{
		String answer;
		String correctanswer="six";
		int i=0;
		Scanner userip=new Scanner(System.in);
		while(i!=3)
		{
			System.out.print("what is the value obtained by multypling  two with three(answer in words):"+" ");
			answer=userip.next();
			if (answer.equals(correctanswer))
			{
				System.out.println("Good");
				break;
			}

			else
				if (i!=2)
				{
					System.out.println("Incorrect answer, try again");
					i++;
				}	  
		}
		if (i==3)
			System.out.println("Incorrect answer,the correct answer="+correctanswer);
	}
}