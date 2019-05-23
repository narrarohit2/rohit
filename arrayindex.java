import java.util.*;
import java.lang.*;
public class main{
public static void main(String args[]){
int n;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(a[i]+" "+i);
}
}
}
