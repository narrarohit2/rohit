import java.util.*;
import java.lang.*;
public class main{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a=n/60;
int s=n%60;
System.out.print(a+" "+s);
}
}
