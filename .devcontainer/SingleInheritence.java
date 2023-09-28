class A
{
	void f1()
	{
	System.out.println("Hello! i m in class A");
    }
}
class B extends A{
	void f2()
	{
		System.out.println("Hello i am in class B");
	}
}
class C extends A
{
	void f3()
	{
		System.out.println("Hello i am in class C");
	}
}
class D extends B
{
	void f4()
	{
		System.out.println("Hello i m in class D");
	}
}
class SingleInheritence
{
	public static void main(String[] args) {
		B obj=new B();
		obj.f1();
		obj.f2();
		C o1=new C();
		o1.f1();
		D o2=new D();
		o2.f1();
		o2.f4();
		o2.f2();
	}
}