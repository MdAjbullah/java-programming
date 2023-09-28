import java.util.*;
class ArrayPrint
{
	public static void main(String[] args) {
		int arr[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i=i+1)
		{
			System.out.println("Enter value in element:"+i);
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i=i+1)
		{
			System.out.print("["+arr[i]+"]");
		}
	}
}