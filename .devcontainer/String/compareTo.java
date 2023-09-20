import java.util.Scanner;

public class compareTo {
      public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");

        String md=scanner.nextLine();

        String s=".org";
        String t=".com";
        String u=".in";
        if(s.compareTo(md)==0){//compareTo()compares two strings
            System.out.println("it is organization type");
        }

        else if(t.compareTo(md)==0){
            System.out.println("it is comersial type");
        }
        else if(u.compareTo(md)==0){
            System.out.println("it is indian type");
        }
        else{
            System.out.println("it is not a valid type");
        }
      }
}
