import java.util.*;
import java.io.*;
import java.lang.*;
public class main{
public static void main(String args[]) throws java.lang.Exception{
int n,a,d;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
a=sc.nextInt();
d=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+a;
a=a+d;
}
System.out.println(sum);
}
}
