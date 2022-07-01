package _LogicalProgrames1;

public class Factorial_Of_Numbers {

	public static void main(String[] args) {
     
		int a=4;
		int fact=1;
		for(int i=a;i>=1;i--)
		{
			fact=i*fact;
			
		}
		System.out.println("Factorial of "+a+" is equl to "+fact+".");
	}

}
