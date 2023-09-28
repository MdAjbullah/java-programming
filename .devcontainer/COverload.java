class A
{
	A()
	{
		System.out.println("CONSTRUCTOR 1");
	}
	A(int a)
	{
		System.out.println("a="+a);
	}
}
class COverload
{
	public static void main(String[] args) {
		A o1=new A();
		A o2=new A(10);
	}
} 