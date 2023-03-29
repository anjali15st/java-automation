import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array element");
		for(i=0;i<a.length;i++) 
	   {
			System.out.print("Enter " +(i+1)+ " Elements :");
			a[i]=sc.nextInt();
	   }
			System.out.println("Array Elements are");
			for(i=0;i<a.length;i++)
				System.out.println("A["+i+"] ="+a[i]);
		
	}

}
