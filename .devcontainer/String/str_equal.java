public class str_equal {
    public static void main(String[] args) {
        String str="hellow";
        String str1="hellow";
        String str2=new String("hellow");

        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));
        
        
    }
    
}
