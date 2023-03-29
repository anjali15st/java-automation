import java.util.Scanner;

public class staticVariable {
	static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
				a=sc.nextInt();
	}
	void putvalue()
	{
		System.out.println("A :"+a);
	}
	public static void main(String[] args)
	{
		staticVariable s1=new staticVariable();
		staticVariable s2=new staticVariable();
		staticVariable s3=new staticVariable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.putvalue();
		s2.putvalue();
		s3.putvalue();
		
		
		
			
	}

}
