import java.util.*;
class Number3
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	for(j=0;j<(2*i-1);j++)
	{
	System.out.print("*");
	}
	System.out.println();
}
for(i=n-1;i>=0;i--)
{
	for(j=0;j<(2*i-1);j++)
	{
	System.out.print("*");
	}
	System.out.println();
}
}
}