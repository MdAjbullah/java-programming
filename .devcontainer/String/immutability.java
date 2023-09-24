public class immutability {
    public static void main(String[] args) {
    //     String str ="a";
    //     str = "b";

    //    System.out.println(str); // every time  we make a copy of the string
        String str= "";
        for(int i=0;i<=10;i++) // "" "1" "12" "123" "1234" "12345" "1
        {
            str=str+i;
        }
        System.out.println(str);


    }
    
}
