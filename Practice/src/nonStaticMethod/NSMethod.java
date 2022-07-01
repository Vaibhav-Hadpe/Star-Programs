package nonStaticMethod;

public class NSMethod {
	public static void main(String[]args){
		NSMethod m=new NSMethod();
		m.mul();
		}
		public void mul()
		{
		int a=20;
		int b=30;
		int d=a*b;
		System.out.println("The multiplication is "+d);
		}

}
