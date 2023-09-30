import java.util.Scanner;

public class multiarray {
    public static void main(String[] args) {
        // 2d array
        
        // we find the memory conguption = (row * col)* datatype size 

        // // initialization declear
        // type[][]arrayName=new type[row][cal];
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col= sc.nextInt();
        
        int [][] num =new int[row][col];
        //input
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }


        }
        //output
        for(int i =0;i<row; i++){
            for(int j=0;j<col;j++){
                System.out.println(num[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
