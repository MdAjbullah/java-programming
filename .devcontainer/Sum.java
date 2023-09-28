import java.io.*;
class Sum
{
	public static void main(String[] args)throws IOException {
		Float a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first no");
		a=Float.parseFloat(br.readLine());
		System.out.println("enter second number");
		b=Float.parseFloat(br.readLine());
		c=a+b;
		System.out.println("sum="+c);

	}
}
