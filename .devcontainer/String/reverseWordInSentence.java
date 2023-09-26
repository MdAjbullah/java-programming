import java.util.Scanner;
public class reverseWordInSentence {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String ans="";
     String s=sc.nextLine();
     StringBuilder sb= new StringBuilder("");
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch!=' '){
            sb.append(ch);
        }
        else{
            sb.reverse();
            ans+=sb;
            ans+="";
            sb=new StringBuilder(" ");
        }
    }
    sb.reverse();
    ans+=sb;
    System.out.println(ans);
    }
    
}
