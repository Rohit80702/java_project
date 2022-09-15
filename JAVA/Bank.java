import java.util.*;
abstract class Bank
{
	abstract int Interest();
}   
class SBI extends Bank
{
	int Interest()
	{
		return 6;
	}
}
class PNB extends Bank
{
	int Interest()
	{
		return 7; 
	}
}
class C
{
	public static void main(String args[])
	{
		Bank b;
		b=new SBI();
		System.out.println(b.Interest());
		b=new PNB();
		System.out.println(b.Interest());
	}
}
