import java.io.*;
class Addition
{
public static void main(String[] args)
{
	int a,b,c,d;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter three numbers");
	try
	{
		System.out.println("Enter First number");
		a=Integer.parseInt(br.readLine());
	}
	catch(Exception e)
	{
		a=5;
	}
	try
	{
		System.out.println("Enter Second Number");
		b=Integer.parseInt(br.readLine());
	}
	catch(Exception e)
	{
		b=2;
	}
	try
	{
		System.out.println("Enter Third Number=");
		c=Integer.parseInt(br.readLine());
	}
	catch(Exception e)
	{
		c=6;
	}
	d=a+b+c;
	System.out.println("The sum of given number="+d);
}
}
