package _StarPattern;

public class Star10_ButterFly {

	public static void main(String[] args) {
       //*        *
	   //**      **
	   //***    ***
	   //****  ****
	   //**********
	   //****  ****
	   //***    ***
	   //**      **
	   //*        *
		//row=9; column=10; star=1;
		int star=1;
		int space=4;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
	}

}
