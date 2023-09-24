public class JavaStringBuilder {
    public static void main(String[] args) {//stringbuilder are used to avoide the interning and immutablity of Java
        StringBuilder str = new StringBuilder("hellow");//size initial 100;
        str.append("world");// .oopend is the used to append the string to the end of the stringbuilder
        System.out.println(str);
        
    }
    
}
