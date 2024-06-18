import java.util.Scanner;

public class fibbo {
    public static void main(String[] args) {
    int n;
Scanner input=new Scanner(System.in);
n=input.nextInt();
int first=0;
int second=1;
int fibo;
System.out.print(first+" "+second);// 0,1
for(int i=3;i<=n;i++){
    fibo=first+second;
    System.out.print(" "+fibo);
first=second;
second=fibo;

}
    }
    
}
