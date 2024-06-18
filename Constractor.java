public class Constractor {
    String name;
    String id;
    int taka;
    /**
     * @param n
     * @param m
     * @param p
     */
    Constractor(String n,String m,int p){
        name=n;
        id=m;
        taka=p;}
        //methods
     void display(){
           
            System.out.println("name:"+name);
            System.out.println("id:"+id);
            System.out.println("Taka:"+taka);

        }
        public static void main(String args[]){
           Constractor con=new Constractor("tanvir", "male", 1000); 
           con.display();
        }
    }
    

