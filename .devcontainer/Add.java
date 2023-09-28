import java.io.*;
class Add
{
	 public static void main(String[] args) {
	 	int a,b,c;
	 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 	try
	 	{
	 		System.out.println("Enter first number=");
	 		a=Integer.parseInt(br.readLine());
	 	}
	 	catch(Exception e)
	 	{
	 		a=5;
	 	}
	 	try
	 	{
	 		System.out.println("Enter Second number=");
	 		b=Integer.parseInt(br.readLine());
	 	}
	 	catch(Exception e) 
	 	{
	 		b=10;
	 	}
	 	c=a+b;
	 	System.out.println("Sum=" +c);	 
	 }
}   