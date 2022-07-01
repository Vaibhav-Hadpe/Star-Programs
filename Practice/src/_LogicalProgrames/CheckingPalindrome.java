package _LogicalProgrames;

import java.util.Scanner;

public class CheckingPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Value ");
		String s = sc.next();
		System.out.println("Given String is "+s);
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("Reverse string is "+s1);
		
		if (s.equals(s1))
		{
			System.out.println("Strings are palindrome.");
		}
		else
		{
			System.out.println("Strings are not Palindrome.");
		}
		
		
	}

}
