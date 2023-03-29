package loop;

import java.util.Scanner;

public class While 
{
   public static void main(String[] args) 
   {
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n:");
	n=sc.nextInt();
	while(n>0)
		
	{
		sum=sum+n;
		n=n-1;
	}
	System.out.print("sum:"+sum);
}
}
