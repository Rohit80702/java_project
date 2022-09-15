import java.util.*;
import java.io.*;

class Patterns
{
	public static void main(String args[])
	{
		int a,i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		n=sc.nextInt();
		int s=(n-2);
		for(a=0;a<=(n*2-1);a++)
		{
			if (a<n)	
			{
				for(i=1;i<=(a*2+1);i++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			if(a>=n && a<(n*2))
			{
				for(j=1;j<(s*2+1);j++)
				{
					s=s-1;
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

			