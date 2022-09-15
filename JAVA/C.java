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
class C extends A
{
	int c = 15;
}
class D 
{
	public static void main(String args[])
	{
		C ob=new C();
		B obj=new B();
		System.out.println(ob.c);
		System.out.println(ob.a);
		System.out.println(obj.b);
		System.out.println(obj.a);
	}
}