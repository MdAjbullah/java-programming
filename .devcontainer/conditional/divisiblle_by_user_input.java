import java.util.Scanner;

public class divisiblle_by_user_input {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the value:");
        int num1=sc.nextInt();
        System.out.println("please enter the divisible number");
        int num2=sc.nextInt();
        if (num2%num1==0){
            System.out.println("it is divisble by:"+num1 );
        }
        else {
            System.out.println("it nnot divisible by:"+num1);
        }

    }

    
}
