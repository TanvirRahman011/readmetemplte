public class eachloop {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50};
        System.out.println(number.length);
        int sum=0;
        for(int x:number){
            sum=sum+x;
            
        }
        System.out.println(sum);
    }
    
}
