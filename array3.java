

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       Scanner input1=new Scanner(System.in);
        int [][] A=new int[2][3];
        int [][]B=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                A[i][j]=input.nextInt();
            }
        }
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                 System.out.print(" "+A[i][j]);
                }
                System.out.println(); 
            }
                for(int i=0;i<2;i++){
                    for(int j=0;j<3;j++){
                        B[i][j]=input1.nextInt();
                    }
                }
                    for(int i=0;i<2;i++){
                        for(int j=0;j<3;j++){
                        System.out.print(" "+B[i][j]);
                        }
                        System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            System.out.print("\t"+(A[i][j]+B[i][j]));
            }
            System.out.println();
}
    }
    
}
