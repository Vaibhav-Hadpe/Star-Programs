package _StarPattern;

public class Star8_UpwardOddTriangle {

	public static void main(String[] args) {
		//    *
		//   ***
        //  *****
		// *******
		
		//row=4 clm=7 space=3 star=1
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
