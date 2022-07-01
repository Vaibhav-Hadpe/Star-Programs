package staticMethod;

public class StaticMethodOverloading {
	static int a;
	static int b;  //static global variable (class variable)accepted in both type of methods.
	static int c;
	int m;//non static global variable(instance variable)accepted only in non static methods.

	public static void main(String[] args) {
		//calling static methods
		test();
		test(25);
		test(20, 20);
		test(10,10,10);
		//calling non static methods
		StaticMethodOverloading smo=new StaticMethodOverloading();
		smo.test1(5);
      
	}
	//1.static method without parameter.
	 public static void test()
     {
  	    a=10;
  	    b=20;
  	   c=a+b;
  	   System.out.println("The addition is "+c);
     }
	//2.static method with 1 parameter.
	 public static void test(int x)
	 {
		  a=x;
		  b=50;
		  c=a+b;
		  System.out.println("parameter 1 addition is "+c);
	 }
	//3.static method with 2 parameter.
	 public static void test(int x,int y)
	 {
		 a=x;
		 b=y;
		 c=a+b;
		 System.out.println("parameter 2 addition is "+c);
	 }
	//4.static method with 2 parameter.
	 public static void test(int x,int y,int z)
	 {
		 a=x;
		 b=y;
		 c=z;
		 
		int d=a+b+c;
		 System.out.println("parameter 3 addition is "+d);
	 }
	//5.Non static method with 1 parameter.
	 public void test1(int p)
	 {
		 a=p;
		int m=20;//this is local variable .
		this.m=10;//calling global variable in local method.
		 c=a+m+this.m;
		 System.out.println("Non static method with parameter add. is "+c);
	 }
}
