package _LogicalProgrames1;

public class ReverseNumberUsingString {

	public static void main(String[] args) {
		//Aim--> Reverse the Given no.Using The String.
      int a=1234;
      //1. convert given no.into String.
      String s = Integer.toString(a);//Convert the integer into String by using
      //integer class and its static method toString(parameter int),gives String.
      String revString="";
      for(int i=s.length()-1;i>=0;i--)
      {
    	 
    	  revString=revString+s.charAt(i);
    	  
      }
      int RevNo = Integer.parseInt(revString);//Convert back string into num.by
      //using Integer class and static method parseInt(parameter String),gives int.
      System.out.println("Reverse No. is "+RevNo);
      
	}

}
