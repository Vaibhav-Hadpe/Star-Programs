package _LogicalProgrames1;

import java.util.Scanner;

public class Checking_ODD_Even_Numbers {

	@SuppressWarnings("resource")//This is for Suppressing the warning.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of Number a");
		int a = sc.nextInt();
		//int a=93;
		if(a%2==0)//%Modular always gives Remainder.
		//If by dividing the no. by 2 and remainder is 0 then it is always even.
		{
			System.out.println(a+" is Even Number.");
		}
		else
		{
			System.out.println(a+" is Odd Number.");
		}

	}

}
