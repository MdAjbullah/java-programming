import java.util.Scanner;
public class decimal_to_BinaryNumber {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int Decimal_Num=sc.nextInt();
        int ans=0;//binary number
        int pow=1;// power of 10
        while(Decimal_Num>0){
            int  parity= Decimal_Num%2;
            ans+=(parity*pow);
           
            pow*=10;
            Decimal_Num/=2;
        }
        System.out.println(ans);
    }
    
}
