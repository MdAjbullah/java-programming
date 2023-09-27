import java.util.Scanner;
public class BinaryNumber_to_Decimal_conversion {
    public static void main(String[] args) {
    // first find unit digits
    //number multiply the lowest power of 2

    //ans add the new number to the ans
    // new divide by 10 then  sum of the power of 2

      Scanner sc = new Scanner(System.in);
       int Binary_Num=sc.nextInt();
      int ans=0;//convert to decimal
       int pow=1;// power of 2
      while(Binary_Num>0){
        int  Unit_Digit= Binary_Num%10;
        ans+=(Unit_Digit*pow);
        Binary_Num/=10;
        pow*=2;
       }
       System.out.println(ans);
    }
    
}
