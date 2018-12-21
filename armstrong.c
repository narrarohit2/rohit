#include<stdio.h>
#include<math.h>
int main()
{
int number,onumber,reaminder,result=0,n=0;
scanf("%d",&number);
onumber=number;
while(onumber!=0)
{
onumber=onumber/10;
n++;
}
onumber=number;
while(onumber!=0)
{
reaminder=onumber%10;
result=result+pow(reaminder,n);
onumber=onumber/10;
}
if(result==number)
{
printf("yes");
}
else
{
printf("no");
}
return 0;
}
