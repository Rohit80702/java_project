import java.util.*;
class Shapes
{
	void Area()
	{
		System.out.println("Wrong choice");
	}
	void Area(int r)
	{
		int ar;
		ar=3.14*r*r;
		System.out.println("Area of circle:"+ar);
	}
	void Area(int l,int b)
	{	
		int area;
		ar=l*b;
		System.out.println("Area of rectangle:"+ar);
	}
}
class B
{
	public static void main(String args[])
	{
		int r,l,b;
		shapes ob=new Shapes();
		ob.Area();
		ob.Area(5);
		ob.Area(5,6);
	}
}