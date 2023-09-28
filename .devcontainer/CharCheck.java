import java.util.*;
import java.io.*;
class CharCheck
{
	public static void main(String[] args)throws IOException {
		char ch;
		System.out.println("Enter any char:");
		ch=(char)System.in.read();
		if(ch>=65&&ch<=90)
			System.out.println("ch is uppercase");
		else if(ch>=97&&ch<=122)
			System.out.println("ch is lowercase");
		else if(ch>=48&&ch<=57)
			System.out.println("ch is numeric");
		else
			System.out.println("ch is special");
	}
}