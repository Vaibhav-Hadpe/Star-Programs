package _StarPattern;

public class Star2_AscendingOrder {

	public static void main(String[] args) {
      //*
	  //**
	  //***
		//Rows=5 Columns=5.
		//stars increasing
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
			 System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}
