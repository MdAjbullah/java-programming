import java.util.Scanner;

public class subsrtng {
    public static void main(String[] args) {
        //string +string/string+integer addition
        Scanner scanner = new Scanner(System.in);
        // String str="abc";
        // str +="def";
        // System.out.println(str);// str abc str+ def ; []
        String str="abcdef";
        System.out.println(str.substring(1,4)); //continus pat of string 
        System.out.println(str.substring(1));
        System.out.println(str.substring(0));
    }
    
}
