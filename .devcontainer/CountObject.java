class ABC
{
	static int c;
	ABC()
	{
		c=c+1;
	}
	void show()
	{
		System.out.println("total object of clas="+c);
	}
	void f1()
	{
		ABC obj[]=new ABC[8];
		for(int i=0;i<8;i=i+1)
		{
			obj[i]=new ABC();
		}
	}
}
class CountObject
{
	public static void main(String[] args) {
		ABC o1=new ABC();
		ABC o2=new ABC();
		ABC o3=new ABC();
		ABC o4=new ABC();
		ABC o5=new ABC();
		o1.show();
		o1.f1();
		o1.show();
		
	}
}