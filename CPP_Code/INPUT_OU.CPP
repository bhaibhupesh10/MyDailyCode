#include<iostream.h>
#include<conio.h>
int main()
{
clrscr();
int a,b,c;
cout<<"a= ";
cin>>a;
cout<<"b=";
cin>>b;
c = a/b;
if (b!=0)
{
cout<<"c= " << c;
}
else
{
cout<<"error";
}
getch();
return 0;
}