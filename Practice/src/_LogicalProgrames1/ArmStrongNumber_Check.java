package _LogicalProgrames1;
//Some Armstrong no. in between 0 to 999 are 0, 1, 153, 370, 371 and 407.
import java.util.Scanner;

public class ArmStrongNumber_Check {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter the value of no. a");
		int a = sc.nextInt();
		
		//int a=150;
		int sumofCubes=0;
		for (int i=a;i>0;i=i/10) 
		{
			int digits = i%10;
			System.out.println(digits);
			sumofCubes=sumofCubes+(digits*digits*digits);
		}
        System.out.println("Given No.is "+a);
        System.out.println("sum of Cubes of Digits of No. is "+sumofCubes);
        
        if(sumofCubes==a)
        {
        	System.out.println("So "+a+" is ArmStrong Number.");
        }
        else
        {
        	System.out.println("So "+a+" is not ArmStrong Number.");
        }
	}

}
