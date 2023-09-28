import java.util.*;
class StringArray
{
	public static void main(String[] args) {
		String s[]=new String[5];
		int i;
		Scanner sc=new Scanner(System.in);
		/*s[0]="Ram";
		s[1]="Mohan";
		s[2]="Sohan";
		s[3]="Ramesh";
		s[4]="Suresh";
		System.out.println(s[2]+"\n"+s[3]+"\n"+s[4]);*/
		System.out.println("Enter Five string");
		for(i=0;i<5;i=i+1)
		{
			s[i]=sc.next();
		}
		for(i=0;i<5;i=i+1)
		{
			System.out.println(s[i]);
		}

	}
}