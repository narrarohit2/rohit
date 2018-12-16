#include<stdio.h>
int main()
{
int m,n;
scanf("%d%d",&m,&n);
for(int i=m+1;i<n;i++)
{
if(i%2==0)
{
primtf("%d ",i);
}
}
return 0;
}
