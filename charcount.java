import java.util.*;
import java.lang.*;
public class main{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char[] a=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++)
{
count++;
if(a[i]==" ")
{
count--;
}
}
System.out.print(count);
}
}
