//priority called sequence
//first call Static block,normal block,constructor,main method
public class staticMethod 
{
	static int a=10;
	static int b;
	public staticMethod() 
	{
		System.out.println("hello");
	}
	static void meth(int x)
	{
		System.out.println("X :"+x);
		System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
	
	{
		System.out.println("Block 1");
	}
	static
	{
		System.out.println("Static block initialized");
		b=a*4;
	}
	{
		System.out.println("Block 2");
	}
public static void main(String[] args) 
{
	staticMethod s=new staticMethod();
	meth(12);
	
	
}

}
