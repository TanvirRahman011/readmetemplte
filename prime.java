import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
    int num;
    Scanner input=new Scanner(System.in);
    num=input.nextInt();
    int count=0;
    for(int i=2;i<num;i++)
    {
if(num %i==0){


count++;
break;
    }

    }
if(count==0){
    System.out.println("this prime");
}
  else{
    System.out.println("this is not prime");
  }  
}
}