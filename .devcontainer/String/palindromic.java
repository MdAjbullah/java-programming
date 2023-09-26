import java.util.*;
public class palindromic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // for (int i = 0; i < n; i++) {
        //     String s = in.next();
        //     if (isPal
        // indrome(s)) {
        //         System.out.println("YES");
        //     } else {
        //         System.out.println("NO");
        //     }
        // }
        // in.close();
        String sc=in.nextLine();
        int i=0;
        int j=sc.length()-1;
        boolean flag=true;
        while(i<j){
            if(sc.charAt(i)!=sc.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if (flag==true){
            System.out.println("YES IT IS A PALINDROME");
        }
        else{
            System.out.println("NO IT IS NOT A PALINDROME");
        }
    
    }
}

