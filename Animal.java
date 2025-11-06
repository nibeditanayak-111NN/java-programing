class dog{
    void eat(){
        System.out.println("eating...");
    }
}
class cat extends dog{
    void eat(){
        System.out.println("eating rat...");
    }
}
class lion extends dog{
    void eat(){
        System.out.println("eating meat...");
    }
}
public class Animal {
    public static void main(String []args){
        dog a = new dog();
        a.eat();
        a=new cat();
        a.eat();
        a = new lion();
        a.eat();
    }
}
