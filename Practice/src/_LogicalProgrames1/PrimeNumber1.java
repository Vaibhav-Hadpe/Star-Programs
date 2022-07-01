package _LogicalProgrames1;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int a=37;
		int count=0;
		for(int i=2;i<a;i++)
		{
		  if(a%i==0)
		  {
		     count++;
		     break;
		  }

		}
		if(count==0)
		{
		 System.out.println(a+" is Prime Number.");
		}
		else
		{
		 System.out.println(a+" is not Prime Number.");
		}

	}

}
