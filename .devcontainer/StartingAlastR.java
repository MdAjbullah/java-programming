import java.util.*;
class StartingAlastR
{
	public static void main(String[] args) {
		String str[]=new String[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten string");
		for(i=0;i<10;i=i+1)
		{
			str[i]=sc.nextLine();
		}
		for(i=0;i<10;i=i+1)
		{
			if(str[i].charAt(0)=='A'&&str[i].charAt(str[i].length()-1)=='r')
			{
				System.out.println(str[i]);
			}
	    }

	}
}