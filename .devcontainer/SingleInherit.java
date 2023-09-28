class A
{
	void f1()
	{
		System.out.println("Hello i m in class A");
	}
}
class B extends A{
	void f1()
	{
		super.f1();
		System.out.println("Hello i m in class B");
	}
}
class SingleInherit
{
	public static void main(String[] args) {
		B obj=new B();
		obj.f1();
	}
}