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
	int b=20;
}
class C extends B
{
	int c=30;
}
class D 
{
	public static void main(String args[])
	{
		C ob=new C();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
	}
}