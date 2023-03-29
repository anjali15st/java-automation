class student
{
	int rno;
	String sname;
	public student() 
	{
		System.out.println("Default constructor");
	}
	
	public student(int rno,String sname) 
	{
		this();
		System.out.println("Parameterized consructor called");
		this.rno=rno;
		this.sname=sname;
	}
}
public class thiskeyword {
	public static void main(String[] args) {
		student s1=new student(1,"ANJALI");
	}

}
