package _LogicalProgrames;

import java.util.Scanner;

public class ReverseString_input {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value");
		String s = sc.next();
		System.out.println("Given String Value is "+s);
				
		//Reverse the String without using Stringbuffer or StringBuilder;
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 s1=s1+s.charAt(i);//i=7//blank+Y=Y
			                   //i=6//Y+T=YT
			                   //i=5//YT+I=YTI
		}
		System.out.println("Reverse String is "+s1);
		
	}

}
