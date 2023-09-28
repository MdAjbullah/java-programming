import java.io.*;
class Swap
{
	public static void main(String[] args)throws IOException{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first no");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter second no.");
		b=Integer.parseInt(br.readLine());
		c=a;
		a=b;
		b=c;
		System.out.println("value of a= "+a+" "+ "value of b="+b);
		
	}
	
	
}