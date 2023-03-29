import java.util.Scanner;

public class Twodimensional 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2d Array");
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("enter"+i+"ROW &"+j+"COLUMN : ");
               a[i][j]=sc.nextInt();
							
			}
		}
		System.out.println("2 d Array is");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
			//	System.out.println("a["+i+"]["+j+"]="+a[i][j]);	
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}	
			
	}

}
