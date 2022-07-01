package nonStaticMethod;

public class Para {
	public static void main(String[]args){
		Para p=new Para();
		p.add(20,10);
		p.sub(50,40);
		p.add(30, 40);

		}
		public void add(int a,int b)
		{
		int c=a+b;
		System.out.println("Addition is "+c);
		}
		public void sub(int d,int e)
		{
		int f=d-e;
		System.out.println("Summation is "+f);

		}

}
