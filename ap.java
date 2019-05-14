import java.util.*;
import java.io.*;
public class main{
public static void main(String args[]){
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
