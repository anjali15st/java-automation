interface ifs1
{
	 static void meth1()
	 {
		System.out.println("Meth1"); 
	 }
}
interface ifs2 extends ifs1
{
	void meth2();
}
public class Interfacedemo implements ifs2 {
    public void meth2()
    {
    	System.out.println("Meth2");
    }
    public static void main(String[] args) {
		Interfacedemo i=new Interfacedemo();
		i.meth2();
		ifs1.meth1();
	}
}
