#include<stdio.h>
int main()
{
int n,m;
scanf("%d",&n);
if(n<0)
{
printf("invalid input");
}
else
{
for(int i=1;i<=5;i++)
{
m=n*i;
printf("%d ",m);
}
}
return 0;
}
