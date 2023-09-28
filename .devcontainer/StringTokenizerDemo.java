import java.util.*;
class StringTokenizerDemo
{
	public static void main(String[] args) {
		String str="Ram is a good boy.He works in TCS.His salary is 30000.";
		StringTokenizer st=new StringTokenizer(str," ");
		int c=st.countTokens();
		System.out.println(c);
		while(st.hasMoreTokens());
		{
			String s;
			s=st.nextToken();
			System.out.println(s);
		}
	}
}