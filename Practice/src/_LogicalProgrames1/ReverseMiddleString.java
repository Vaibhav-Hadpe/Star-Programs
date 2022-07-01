package _LogicalProgrames1;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
       String s="ABC PQR XYZ";
       String[] ar = s.split(" ");
       
       for(int i=0;i<=ar.length-1;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.println(ar[i]);
    	   }
    	   else
    	   {
    		  String s1 = ar[i];//convert array into string then we can apply reverse Method.
    		                    //Call the reverse method pass parameter which stored in ref variable.
    		  ar[i]=reverseString(s1);
    		  System.out.println(ar[i]);
    	   }
       }
	}
	public static String reverseString(String input)//This static method to reverse the String.
	{
		String Reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			 Reverse = Reverse+input.charAt(i);
		}
		return Reverse;
	}

}
