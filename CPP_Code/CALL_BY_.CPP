#include<iostream.h>
#include<conio.h>

	void addOne(int x){
	x=x+1;
	}

	int main(){
	clrscr();
	int num = 5;
	addOne(num);
	cout<<"the value of num after  calling addOne: " <<num<<endl;
	getch();
	return 0;
	}