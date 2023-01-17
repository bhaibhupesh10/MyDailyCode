// default constructor initializing

class MyClass {
	public:
		MyClass():x(0) {} // default constructor initializing x with 0 
			int x;
		};
int main()
{
MyClass obj;
cout<<obj.x<<endl;
return 0;
}