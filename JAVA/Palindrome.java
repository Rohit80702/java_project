import java.util.*;
import java.io.*;
public class Palindrome
{
public static void main(String args[])
{
int n,r,sum=0,copy;
Scanner in=new Scanner(System.in);
System.out.println("ENTER ANY NUMBER");
n=in.nextInt();
copy=n;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(copy==sum)
System.out.println("IT IS A PALINDROME NUMBER");
else
System.out.println("IT IS NOT A PALINDROME");
}
}
