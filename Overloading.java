public class Overloading {
    static void bio(){
        System.out.println("hello...");
    }
    static void bio(String name,int age){
      System.out.println("your name is:"+name+"your age is:"+age);
    }
    static void bio(int mark){
        System.out.println("yoer mark is:"+mark);
    }
    public static void main(String[]args){
        bio();
        bio("nibedita,",19);
        bio(90);
    }
}
