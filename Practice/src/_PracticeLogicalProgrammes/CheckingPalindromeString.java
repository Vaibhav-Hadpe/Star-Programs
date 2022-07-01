package _PracticeLogicalProgrammes;

public class CheckingPalindromeString {

	public static void main(String[] args) {
		String s="NITIN";
		String blank="";
		for(int i=s.length()-1;i>=0;i--)
		{
		   blank=blank+s.charAt(i);
		}
		System.out.println("Given String is "+s);
		System.out.println("Reverse String is "+blank);
		if(s.equals(blank))
		{
		 System.out.println("Given String is Palindrome.");
		}
		else
		{
		 System.out.println("Given String is not Palindrome.");
		}
	}

}
