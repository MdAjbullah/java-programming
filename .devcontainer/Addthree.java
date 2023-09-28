import java.io.*;
class Addthree
{
  public static void main(String[] args) {
		
		int a,b,c,d;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("enter three Numbers");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			a=2;
			b=5;
			c=7;
		}
	d=a+b+c;
	System.out.println("sum="+d);
}

}