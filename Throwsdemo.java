import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwsdemo {
	
	public static void demo()throws ArithmeticException,InputMismatchException,ArrayIndexOutOfBoundsException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter x :");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("Square of "+x+" is "+(x*x));
			}
			else
			{
			    throw new ArithmeticException();
			    
			}
		
	}
	public static void main(String[] args) {
		try {
		demo();
		}catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		finally
		{
			System.out.println("Finally Caught");
		}
	}

}
