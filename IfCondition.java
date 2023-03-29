//nested if else
//if/else
import java.util.Scanner;

public class IfCondition 
{
public static void main(String[] args) 
{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter A:");
    a=sc.nextInt();
    System.out.print("Enter B:");
    b=sc.nextInt();
    System.out.print("Enter C:");
    c=sc.nextInt();

    if(a>b)
    {
       if(a>c)
       {
    	System.out.println("A is greater no.");
    }
    else
    {
    	System.out.println("C is greater no.");
    }
 }
    else if(b>c)
    {
    	System.out.println("B is greater no.");
    }
    else
    {
    	System.out.println("C is greater no.");
    }
}
}
//Simple if(positive/negative)
//int a;
//Scanner sc=new Scanner(System.in);
//SYSO("enter A:");
//a=sc.nextInt();
//if(a>0)
//{
//syso ("a is positive no")
//}
//else{}
//syso("b is positive no")
//if(a%2==0) (for odd and even)

