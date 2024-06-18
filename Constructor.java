class Box{
    int weidth;
    int length;
    int height;


Box(int n,int  p,int q){
    weidth=n;
    length =p;
    height=q;
}

    int Volume(){
       
        return weidth*length*height;
 }
}
public class Constructor {
    public static void main(String[] args) {
          Box con=new Box(10,20,30);
          Box co1=new Box(10,20,30);
        double Vol;
          Vol=con.Volume()
        System.out.println("volume is:"+Vol);
         //con.Volume();
         Vol=co1.Volume();
         System.out.println("volume is:"+Vol);  
          //co1.Volume();
} 
}

