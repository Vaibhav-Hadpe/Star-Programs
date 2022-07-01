package _LogicalProgrames;

import java.util.Scanner;

public class InputFromUser_INT {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of A ");
		int A = sc.nextInt();
		System.out.println("Enter the Value of B ");
		int B=sc.nextInt();
		int Sum=A+B;
		System.out.println("The Addition of A and B is "+Sum);

	}

}
