#include<stdio.h>
int main()
{
int factorial=1;
scanf("%d",&n);
if(n<0)
{
printf("invalid input");
}
else
{
for(int i=1;i<=n;i++)
{
factorial=factorial*i;
}
printf("%d",factorial);
}
return 0;
}

