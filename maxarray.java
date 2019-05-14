import java.util.*;
import java.io.*;
import java.lang.*;
public class main{
public static void main(String args[])throws java.lang.Exception{
int a,i,max;
int []b = new int[100];
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
max=b[0];
for(i=1;i<a;i++)
{
if(b[i]>max)
{
max=b[i];
}
}
System.out.println(max);
}
}
