import java.util.*;
class A
{
	int a=10;
	void display()
	{
		System.out.println("HELLO");
	}
}
class B extends A
{
	public static void main(String args[])
	{
		A ob=new A();
		System.out.println(ob.a);
		ob.display();
	}
}