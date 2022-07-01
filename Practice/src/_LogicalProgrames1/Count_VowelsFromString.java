package _LogicalProgrames1;

public class Count_VowelsFromString {

	public static void main(String[] args) {
		String s="I LOVE MY INIDA";
		char []s1= {'A','E','I','O','U'};
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char value = s.charAt(i);
			for(int j=0;j<=s1.length-1;j++)
			{
				char vowels=s1[j];
				 if(vowels==value)
				 {
					 count++;
				 }
			}
		}
		System.out.println("Total No. of Vowels in Given String is "+count);
	}

}
