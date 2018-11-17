#include<stdio.h>
int main()
{
char x;
scanf("%s",x);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
{
printf("Vowel");
}
else if(x=='$'||x=='@'||x=='!'||x=='%'||x=='^'||x=='&'||x=='*'||x=='('||x==')')
{
printf("Invalid");
}
else
{
printf("Consonant);
}
return 0;
}
