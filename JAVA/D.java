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
	int b=25;
}
class C extends B
{
	int c=10;
}
class D extends C
{
	int d=20;
}
class E extends C
{
	int e = 15;
}
class F 
{
	public static void main(String args[])
	{
		E ob=new E();
		D ob1=new D();
		System.out.println(ob.e);
		System.out.println(ob.c);
		System.out.println(ob1.c);
		System.out.println(ob1.d);
		System.out.println(ob.b);
		System.out.println(ob.a);
	}
}