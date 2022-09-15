import java.util.*;
class Shapes
{
	void Area()
	{
		System.out.println("Wrong choice");
	}
	void Area(int r)
	{
		double ar;
		ar=3.14*r*r;
		System.out.println("Area of circle:"+ar);
	}
	void Area(int l,int b)
	{	
		int ar;
		ar=l*b;
		System.out.println("Area of rectangle:"+ar);
	}
}
class B
{
	public static void main(String args[])
	{
		int r,l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		r=sc.nextInt();
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter length");
		l=ob1.nextInt();
		Scanner ob2=new Scanner(System.in);
		System.out.println("enter breath");
		b=ob2.nextInt();
		Shapes ob=new Shapes();
		ob.Area();
		ob.Area(r);
		ob.Area(l,b);
	}
}