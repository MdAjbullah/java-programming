import java.util .*;
class StckDemo
{
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		Integer n;
		int num;
		while(true)
		{
			System.out.println("Enter any data");
			num=sc.nextInt();
			if(num!=0)
			{
				s.push(num);
			}
			else 
			{
				break;
			}
		}
		System.out.println(s.pop());
	}
}