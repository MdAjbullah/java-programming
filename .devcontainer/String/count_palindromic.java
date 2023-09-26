import java.util.Scanner;
public class count_palindromic {

   public static boolean isPalindromic(String s) {
      int i =0;
      int j=s.length()-1;
      while(i<j){
          if(s.charAt(i)!=s.charAt(j))return false;
           
         
         i++;
         j--;
     
        }
      return true;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindromic(str.substring(i, j))==true){
                    System.out.print(str.substring(i, j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\n The number of palindromic substring is:"+count);
    }
    
}

