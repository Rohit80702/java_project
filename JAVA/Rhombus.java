import java.util.*;
class Rhombus
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=i;j<=n;j++)
			{	
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("+");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
		for(i=1;i<n+1;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print("+");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print("+");
			}
			System.out.println();				
		}
	}
}
	