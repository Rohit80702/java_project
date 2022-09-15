import java.util.*;
import java.io.*;
class Calculator
{
public static void main(String args[])
{
int ch,add,sub,multi,div,sqr,s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE CHARACTER");
ch=sc.nextInt();
switch(ch)
{
case 1: System.out.println("enter first number");
	  s1=sc.nextInt();
	  System.out.println("enter second number");
	  s2=sc.nextInt();
	  add=s1+s2;
	  System.out.println("sum is="+add);
	  break;
case 2: System.out.println("enter first number");
	  s1=sc.nextInt();
	  System.out.println("enter second number");
	  s2=sc.nextInt();
	  multi=s1*s2;
	  System.out.println("multiplication is="+multi);
	  break;
case 3: System.out.println("enter first number");
	  s1=sc.nextInt();
	  System.out.println("enter second number");
	  s2=sc.nextInt();
	  div=s1/s2;
	  System.out.println("division is="+div);
	  break;
case 4: System.out.println("enter first number");
	  s1=sc.nextInt();
	  System.out.println("enter second number");
	  s2=sc.nextInt();
	  sub=s1-s2;
	  System.out.println("subtraction is="+sub);
	  break;
case 5: System.out.println("enter the number");
	  s1=sc.nextInt();
	  sqr=s1*s1;
	  System.out.println("square is="+sqr);
	  break;
default:System.out.println("WRONG CHOICE");
}
}
}