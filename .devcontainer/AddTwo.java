import java.io.*;
class AddTwo
{
	public static void main(String[] args) {
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("enter two numbers");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			a=2;
			b=5;
		}
		c=a+b;
		System.out.println("sum="+c);
	}
}