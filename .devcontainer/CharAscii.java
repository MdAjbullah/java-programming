import java.io.*;
class CharAscii
{
	public static void main(String[] args) {
		char ch;
		try
		{
			System.out.println("Enter any character");
			ch=(char)System.in.read();
		}
		catch(Exception e)
		{
			ch='A';
		}
		System.out.println((int)ch);
	}
}