import java.io.*;
import java.util.*;
import java.lang.*;
public class main{
public static void main(String args[])throws java.lang.Exception{
{
int n,i,j,temp;
int a[]=new int[100];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}
