import java.util.*;
class A1
{
	void A1()
	{
		System.out.println("HI");
	}
	void A1(int a)
	{
		this();
		System.out.println("Value:"+a);
	}
}
class B1
{
	public static void main(String args[])
	{
		int a=20;
		A1 ob=new A1();
		ob.A1(a);
	}
}