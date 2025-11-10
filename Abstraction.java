abstract class A{
  abstract void volume();
  abstract void chanel();
  void see(){
    
  }
}
class B extends A{
 void volume(){
    System.out.println("volume is increase");
 }
void chanel(){
    System.out.println("chanel is changed");
}
void see(){
System.out.println("i see the chanel");
}
}
public class Abstraction {
public static void main(String[]args){
    B tv =new B();
    tv.volume();
    tv.chanel();
    tv.see();

}
}
