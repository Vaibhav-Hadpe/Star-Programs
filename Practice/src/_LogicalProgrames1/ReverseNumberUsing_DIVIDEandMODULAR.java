package _LogicalProgrames1;

public class ReverseNumberUsing_DIVIDEandMODULAR {

	public static void main(String[] args) {
		//Aim-->Reverse the no. using Divide and Modular.Not String.
		
        int a=1234;
        int digits;
        int revNo=0;
        for(int i=a;i>0;i=i/10)
        {
        	digits =i%10;
        	System.out.println(digits);
        	revNo=revNo*10+digits;
        }
        System.out.println(revNo);
        int b=30;
        int c=b+revNo;
        System.out.println(c);
	}

}
