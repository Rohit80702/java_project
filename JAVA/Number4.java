import java.util.*;
class Number4
{
public static void main(String args[])
{
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
	n=sc.nextInt();
	int c=1,d=1,e=1;
	int k=2*n;
	while(c<k)
	{
		if(d<=n)
		{
			for(j=1;j<=d;j++)
			{
			System.out.print(j);
			}
			System.out.println();
			d=d+1;
			c=c+1;
	 		e=d;
		}
	
		else
		{
			for(j=1;j<(e-1);j++)
			{
				System.out.print(j);
			}
			System.out.println();
			e=e-1;
			d=d+1;
			c=c+1;
		}
	}
}
}