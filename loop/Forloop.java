package loop;

import java.util.Scanner;

public class Forloop 
{
 public static void main(String[] args) 
 {
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter N:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	
	}
	System.out.println("Sum:"+sum);
}
}
