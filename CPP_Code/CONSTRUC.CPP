#include<iostream.h>
#include<conio.h>

class MyClass
{

      public:
	  MyClass() : x(0) {} // default constructor initializing x with 0
      int x;
};
   int main()
{
clrscr();
   MyClass obj;
    cout<<obj.x<<endl;  // OUtput: 0
    getch();
    return 0;
}