package _PracticeLogicalProgrammes;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int a=5;
		int fact=1;
		for(int i=a;i>=1;i--)
		{
		  fact=i*fact;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}

}
