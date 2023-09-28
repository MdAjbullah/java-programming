import java.util.*;
class StringCharPrint
{
	public static void main(String[] args) {
		String s; int i,l;char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		s=sc.next();
		l=s.length();
		i=0;
		while(i<l)
		{
			ch=s.charAt(i);
			System.out.println(ch);
			i=i+1;
		}
	}
}