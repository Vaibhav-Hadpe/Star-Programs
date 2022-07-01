package mainMethodOverloading;

public class MainOverload {

	public static void main(String[] args) {
       main("a");
       main();
       main('a');
	}
	public static void main(String args)//String Arguments
	{
		System.out.println("Test 1");
	}
	public static void main()//without Arguments
	{
		System.out.println("Test 2");
	}
	public static void main(char args)//Char Arguments
	{
		System.out.println("Test 3");
	}
}
