
#include<iostream.h>
#include<conio.h>

class base {
       protected:
	int a, b;
	public:
	void input(){
	cout<<"enter values: "<<endl;
	cin>>a>>b;
	}
      /*	void show()
	{
	cout<<"a = "<<a << " "<<"b= " <<b<<endl;
	} */
	};
	class derive: public base{
	private:
	int m, n;
	public:
	void getdata()
	{
	cout<<"enter values: ";
	cin>>m>>n;
	       }
	void display()
	{
	cout<<"m= "<<m<<" "<<"n= "<<n<<endl;
	cout<<"a= "<<a<<" "<<"b= "<<b<<endl;
	}
	};

	void main(){
	clrscr();
      //	base ob;
	derive ob1;
      //	ob.input();
      //	ob.show();
	ob1.input();
      //	ob1.show();
	ob1.getdata();
	ob1.display();
	getch();
	}
