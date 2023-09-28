import java.io.*;
class AddFive
{
	public static void main(String[] args) {
		int a,b,c,d,e,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter five Num");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
			d=Integer.parseInt(br.readLine());
			e=Integer.parseInt(br.readLine());
		}
		catch(Exception ex)
		{
			a=1;
			b=2;
			c=3;
			d=4;
			e=5;
		}
		s=a+b+c+d+e;
		System.out.println("Sum="+s);
		
	}
}