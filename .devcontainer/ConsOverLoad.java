class Room1
{
	int l,b,h;
	Room1()
	{
		l=0;
		b=0;
		h=0;
	}
    Room1(int a)
    {
    	l=a;
    	b=0;
    	h=0;
    }
    Room1(int a,int b)
    {
    	l=a;
    	this.b=b;
    	h=0;
    }
    Room1(int a,int b,int c)
    {
        l=a;
    	this.b=b;
    	h=c;
    }
    void show()
    {
    	System.out.println("the value of L="+l);
    	System.out.println("the value of B="+b);
    	System.out.println("the value of H="+h);
    }
    void setLength(int l)
    {
    	this.l=l;
    }
    void setBreadth(int b)
    {
    	this.b=b;
    }
    void setHeight(int h)
    {
    	this.h=h;
    }
}
class ConsOverLoad
{
	public static void main(String[] args) {
		Room1 r1=new Room1();
		Room1 r2=new Room1(12,13,30);
		r1.show();
		r2.show();
		Room1 r3=new Room1(12,34);
		r3.show();
		r1.setLength(20);
		r1.setBreadth(11);
		r1.setHeight(34);
		r1.show();
		r2.setLength(60);
		r2.show();
	}
}