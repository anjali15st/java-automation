import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Start code");
		try
		{
		System.out.print("Enter A :");
		a=sc.nextInt();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter B :");
		b=scanner.nextInt();
		
		c=a/b;
		System.out.println("Division :"+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught :"+e);
		}
	}
}
	
				
	


