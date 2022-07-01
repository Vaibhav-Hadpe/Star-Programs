package _LogicalProgrames1;

import java.util.HashMap;
import java.util.Set;

public class UseOfHasMapRepeatatingString {

	public static void main(String[] args) {
       String s="ABC PQR XYZ ABC PQR XYZ ABC PQR XYZ XYZ";
       String[] ar = s.split(" ");
       HashMap<String, Integer> map=new HashMap<String, Integer>();
       for(int i=0;i<=ar.length-1;i++)
       {
    	   String str = ar[i];
    	   if(map.containsKey(str))
    	   {
    		   map.put(str, map.get(str)+1);
    	   }
    	   else
    	   {
    		   map.put(str, 1);
    	   }
       }
       Set<String> keys = map.keySet();
       for(String K:keys)
       {
    	   System.out.println(K+" "+map.get(K));
       }
	}

}
