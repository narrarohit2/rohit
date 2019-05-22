import java.util.*;
import java.lang.*;
public class main{
public static void main(Sgring args[])throws java.lang.Exception
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();
}
int median=n/2;
if(n%2!=0)
{
System.out.print(a[median]);
}
else
{
System.out.println(a[median-1]);
System.out.println(a[median]);
}
}
}
