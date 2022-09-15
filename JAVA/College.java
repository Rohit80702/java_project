import java.util.*;
import java.io.*;
class College
{
	int roll;
	String name;
	static String c="SIT";
	College(int a,String b)
	{
		roll=a;
		name=b;
	}
	static void change()
	{
		c="KVS";
	}
	void display()
	{
		System.out.println(roll + " " + name +" " + c);
	}
}
class D
{
	public static void main(String args[])
	{
		College ob=new College(1,"Rohit");
		ob.display();
		College.change();
		College ob1=new College(2,"Aryan");
		ob1.display();				
  	}
}