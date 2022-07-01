package _LogicalProgrames1;

public class WhiteSpaces_Count_from_String {

	public static void main(String[] args) {
     
		String s=" V A I B H A V ";
		char space=' ';
		int count = 0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char value = s.charAt(i);
			if(value==space)
			{
				count++;
			}
		}
		System.out.println("Total no. of spaces in given String is "+count);
	}

}
