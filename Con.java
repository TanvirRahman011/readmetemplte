class Const{
    String name;
    int age;
    int roll;
    Const(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
        
    }
}
    

public class Con {
    public static void main(String[] args) {
        Const var=new Const("anisul",20,300);
System.out.println(var.name+" "+var.age+" "+var.roll);
    }  
}
