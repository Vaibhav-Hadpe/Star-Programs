package _PracticeLogicalProgrammes;

import java.util.Scanner;

public class OddEvenNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		//int a=34;
		if(a%2==0)
		{
		 System.out.println(a+" is Even Number.");
		}
		else
		{
		 System.out.println(a+" is Odd Number.");
		}
	}

}
