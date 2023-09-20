import java.util.Scanner;

public class Leap_Years {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the year:");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("yes it is leap years ");

        }
        else {
            System.out.println("it is not leap year");
        }
    }
    
}
