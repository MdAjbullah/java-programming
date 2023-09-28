class Constudent
{
	String name;
	int rno;
	Constudent()
	{
		name="ABC";
		rno=123;
	}
	Constudent(String str,int n)
	{
		name="Ram";
		rno=231;
	}
}
	class ConsDemo
	{
	public static void main(String[] args) {	
        Constudent s1=new Constudent();
		Constudent s2=new Constudent("def",123);
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s2.name);
		System.out.println(s2.rno);
	}
}