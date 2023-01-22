#include<iostream.h>
#include<conio.h>

class Arithmetic {
int a, b, c; // data memebers;

public:
void get(){
cout<<"Enter a, b and c: ";
cin>>a>>b>>c;
}
int add()
{
return a+b+c;
}
int sub()
{
return a-b-c;
}

int mul(){
return a*b*c;
}
};

int main()
{
clrscr();
Arithmetic obj; //creates an object of the class Arithmetic
	obj.get(); // call the get() function;
	cout<<"Addition is: "<<obj.add()<<endl;
	cout<<"Substraction is ; " <<obj.sub()<<endl;
	cout<<"Multiplication is : "<<obj.mul()<<endl;
	getch();
	return 0;
	}














