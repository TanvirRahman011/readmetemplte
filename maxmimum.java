import java.util.Scanner;

public class maxmimum {
    public static void main(String[] args) {
       int number[]=new int[5];
       int i;
       Scanner input=new Scanner(System.in);
            number[i]=input.nextInt();
        
        int max=number[0];
        int mini=number[0];
        for(i=0;i<5;i++){
        if(max>mini){
            max=number[i];
        }
      
    
    if(mini>number[i]){
        mini=number[i];
    }
}
    System.out.println("maximum:"+max);  
    System.out.println("minimum:"+mini);
}
}