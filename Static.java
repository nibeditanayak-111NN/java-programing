public class Static {
    static class dog{
        static void bark (){
            System.out.println("dog is barking");
        }
    }
    class main{
        static int a = 50;
        static int b;
        static int max;
        static{
            System.out.println("extending static block");
            b = a+a;
        }
        static{
            System.out.println("extending second static block");
            max = 100;
        }
        static void display(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(max);
        }
    }
    public static void main(String[]args){
         dog.bark();
         main.display();
    }
}
