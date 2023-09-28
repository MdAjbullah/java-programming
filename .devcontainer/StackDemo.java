import java.util.*;
class StackDemo
{
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		Integer n;
		s.push(45);
		s.push(24);
		s.push(122);
		s.push(555);
		s.push(666);
		System.out.println(s.search(666));

		n=s.pop();
		System.out.println(n); 
		n=s.pop();
		System.out.println(n);
		n=s.pop();
		System.out.println(n);
		n=s.pop();
		System.out.println(n);
		n=s.pop();
		System.out.println(n);


	}
}