#include<iostream.h>
#include<conio.h>
void main() {
clrscr();
int a, b, c;
cout<<"enter a , b, c";
cin>>a>>b>>c;
if(a>b && a>c){
cout<<"a is largest \n";
}
else if(b>c&&b>a ) {
cout<<"b is largest \n ";
      }
else if(c>a&&c>b){
cout<<"c is largest \n";
}

getch();

     }