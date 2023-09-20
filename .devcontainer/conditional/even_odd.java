public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter the value:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("given number is even:"+num);

        }
        else{
            System.out.println("the given number is odd:"+num);
        }


    }

    
}
