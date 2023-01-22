	    #include<iostream.h>
	    #include<conio.h>
	    class A
	    {
		    float a, b;
	    public :
	    void show	(int x, int y)
	    {
	    a = x; b=y;
	    cout<<a<<" "<<b<<endl;
	    }
	    void show (float x, float y)

	    {
	    a = x; b=y;
	    cout<<a<<" " <<b<<endl;
	    }
	    };
	    void main()
	    {
	    clrscr();
	    A ob, ob2;
	ob.show(20, 34);
	ob2.show(34.4f, 34.3f);
	getch();
	}