#include<iostream.h>
#include<conio.h>

int main()
{
clrscr() ;

int num[3] = {100, 200, 300};
num [1] = 500;
for (int i=0;i<3;i++)
{
cout<<num[i]<<endl;
}
getch();
return 0;
}