package _LogicalProgrames1;

import java.util.HashMap;
import java.util.Set;
//Aim To Find how many times and what characters are repeating.Using HashMap.
public class UseOfHasMapRepeatatingChar {

	public static void main(String[] args) {
      String s="abcabcabca";
      HashMap<Character, Integer> mp=new HashMap<Character,Integer>();
      for(int i=0;i<=s.length()-1;i++)
      {
    	  char chars = s.charAt(i);
    	  if(mp.containsKey(chars))
    	  {
    		  mp.put(chars, mp.get(chars)+1);
    	  }
    	  else
    	  {
    		  mp.put(chars, 1);
    	  }
      }
	      
          Set<Character> keys = mp.keySet();
          for(Character K:keys)
          {
        	  System.out.println(K+"="+mp.get(K));
          }
	}

}
