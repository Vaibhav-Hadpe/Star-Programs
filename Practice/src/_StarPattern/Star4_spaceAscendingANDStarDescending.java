package _StarPattern;

public class Star4_spaceAscendingANDStarDescending {

	public static void main(String[] args) {
      //*****
	  // ****
	  //  ***
	  //   **
	  //    *
		//Rows=5 Columns=5
		//space increasing
		//star decreasing
		int space=0;
		int star=5;
		for(int i=1;i<=5;i++)
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
			space++;
			star--;
		}
	}

}
