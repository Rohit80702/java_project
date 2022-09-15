import java.util.*;
abstract class Car
{
	abstract void run();
}
class B extends Car
{
	void run()
	{
		System.out.println("CAR BRAND");
	}
}
class C
{
	public static void main(String args[])
	{
		Car ob=new B();
		ob.run();
	}
}