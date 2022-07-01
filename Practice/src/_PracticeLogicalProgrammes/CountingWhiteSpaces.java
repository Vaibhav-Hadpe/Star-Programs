package _PracticeLogicalProgrammes;

public class CountingWhiteSpaces {

	public static void main(String[] args) {
		String s="V A I B H A V";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
		  char value=s.charAt(i);
		  char space=' ';
		  if(value==space)
		  {
		    count++;
		  }
		}
		System.out.println("Total no. of Spaces in given String is "+count);
	}

}
