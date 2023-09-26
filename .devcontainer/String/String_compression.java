import java.util.*;
public class String_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        
        String ans=""+s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
              ans+=count;
              count=1  ; 
              ans+=curr;
            }
          
        }
          if(count>1) ans+=count;
            System.out.println(ans);
      
        
       
    }
}
    

