package _LogicalProgrames1;

public class Verify_PRIME_No {

	public static void main(String[] args) {
		
		int a=35;
		int count=0;
		for(int i=2;i<a;i++)
		{
		  if(a%i==0)
		  {
			  count++;
			 
		  }

	   }
		System.out.println("Total No.of divisor is "+count);
		if(count==0)
		{
			System.out.println(a+" is a Prime Number.");
		}
		else
		{
			System.out.println(a+" is not a Prime Number.");
		}

}
}
