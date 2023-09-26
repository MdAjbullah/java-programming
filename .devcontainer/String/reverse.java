public class reverse {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("mdajbullah");
        System.out.println(sb);
        sb.reverse();// .reverse is a method of StringBuilder class reverse the string
        System.out.println(sb);
        // delete sb.reverse();
        sb.delete(0, 3);  //if we want to  delete the all string then we need the used to delete then start index or total index +1
        System.out.println(sb);
        System.out.println(sb.substring(0, 7));

    }
    
}
