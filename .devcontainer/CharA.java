import java.io.*;
class CharA
{
	public static void main(String[] args)throws IOException {
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any character");
			ch=(char)System.in.read();
		System.out.println((int)ch);
	}
}