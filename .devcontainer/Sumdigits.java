import java.util.*;
class Sumdigits
{
	public static void main(String[] args) {
		long a,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
         a=sc.nextInt();
         for(sum=0; a!=0; a/=10)
         {
         	sum+=a%10;
         }
         System.out.println("sum of digits="+sum);
	}
}