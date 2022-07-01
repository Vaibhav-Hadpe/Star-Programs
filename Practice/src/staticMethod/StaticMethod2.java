package staticMethod;

public class StaticMethod2 {

	public static void main(String[] args) {
		sub();
		StaticMethod1.add();

	}
	public static void sub()
	{
		int a=30;
		int c=40;
		int d=a+c;
		System.out.println("sum of "+d);
	}

}
