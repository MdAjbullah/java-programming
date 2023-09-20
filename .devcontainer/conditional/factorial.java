import java.util.Scanner;

public class factorial {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number :");
        int num=sc.nextInt();
        int res=1,i;
        for (i=2;i<=num;i++){
            res=res*i;
        }
        System.out.println("factorial is :"+ res);
    }
    
}
