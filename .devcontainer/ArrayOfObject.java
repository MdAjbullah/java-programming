import java.util.*;
class Student
{
	int roll;
	String name;
	String course;
	int fee;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll,Name,Course and Fee");
		roll=sc.nextInt();
		name=sc.next();
		course=sc.next();
		fee=sc.nextInt();
	}
	void show()
	{
		System.out.println("Roll="+roll);
		System.out.println("Name="+name);
		System.out.println("Course="+course);
		System.out.println("Fee="+fee);
	}
}
class ArrayOfObject 
{
	public static void main(String[] args) {
		Student s[]=new Student[5];
		int i;
		for(i=0;i<5;i=i+1)
			{
			s[i]=new Student();
			}
			for(i=0;i<5;i=i+1)
			{
				s[i].input();
			}
			for(i=0;i<5;i=i+1)
			{
				s[i].show();
			}
		
	}
}