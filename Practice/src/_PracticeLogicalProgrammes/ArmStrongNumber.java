package _PracticeLogicalProgrammes;

import java.util.Scanner;

public class ArmStrongNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 'a' to check weather it is Armstrong Number or not.");
		int a=sc.nextInt();//a=370
		int sumofCubes=0;
		for(int i=a;i>0;i=i/10)//1.370,2.370/10=37,3.37/10=3
		{
		  int digits=i%10;//370%10=0,37%10=7,3%10=3.
		  System.out.println(digits);
		  sumofCubes=sumofCubes+(digits*digits*digits);
		}
		System.out.println("Given no is "+a);
		System.out.println("Sum of cubes of digits is "+sumofCubes);
		if(sumofCubes==a)
		{
		  System.out.println("So "+a+" is Armstrong Number.");
		}
		else
		{
		  System.out.println("So "+a+" is not Armstrong Number.");
		}


	}

}
