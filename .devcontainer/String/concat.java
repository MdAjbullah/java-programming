public class concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1+s2); // .concat(s1, s2) are tow strings through concat function we can join both strings
    }
    
}
