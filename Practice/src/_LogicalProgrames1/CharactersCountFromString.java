package _LogicalProgrames1;

public class CharactersCountFromString {

	public static void main(String[] args) {
       String s="I LOVE MY INIDA";
       char letter='I';
       int count=0;
       
       for(int i=0;i<=s.length()-1;i++)
       {
    	  char value = s.charAt(i);
    	  
    	  if(value==letter)
    	  {
    		  count++;
    	  }
       }
       System.out.println("Total no. of Times "+letter+" occured in Given String is "+count);
	}

}
