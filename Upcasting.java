class work{
    void see(){
        System.out.println("i am seen movie");
    }
}
class activity extends work{
void write(){
    System.out.println("i am writing storey");
 }
}
class pent extends activity{
void draw(){
    System.out.println("i am drawing picture");
 }
}
public class Upcasting {
    public static void main(String[]args){
        work s = new work ();
        s.see();
        activity a= new activity();
        a.write();
        pent p = new pent();
        p.draw();
    }
}
