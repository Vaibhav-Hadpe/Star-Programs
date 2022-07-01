package _LogicalProgrames;

import java.util.Arrays;

public class Arrays_Equal {

	public static void main(String[] args) {
      int []ar1= {10,20,30};
      int []ar2= {40,50,60};
      int []ar3= {10,20,30};
      
      //Comparing two arrays by using Arrays class by using equals Method.
      //1.compare ar1 and ar2
      System.out.println(Arrays.equals(ar1, ar2));
      
    //2.compare ar2 and ar3
      System.out.println(Arrays.equals(ar2, ar3));
      
    //3.compare ar1 and ar3
      System.out.println(Arrays.equals(ar1, ar3));
	}

}
