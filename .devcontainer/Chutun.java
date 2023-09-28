import java.io.*;
class Chutun
{
	public static void main(String args[])
	{
		int a,b,c,d;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter a first number=");
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			a=5;
		}
		try
		{
			System.out.println("Enter second line=");
			b=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			b=7;
		}
		try
		{
			System.out.println("Enetr third number=");
			c=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			c=8;
		}
		d=a+b+c;
		System.out.println("Sum="+d);
	}
}