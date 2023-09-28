import java.util.*;
class ScannerDemo
{
	public static void main(String[] args) {
		int a;
		float b;
		double d;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer");
		a=sc.nextInt();
		System.out.println("enter any float");
		b=sc.nextFloat();
		System.out.println("enter any double");
		d=sc.nextDouble();
		System.out.println("enter any string");
		s=sc.next();
		System.out.println(a+" "+b+" "+d+" "+s+" ");
	}
}