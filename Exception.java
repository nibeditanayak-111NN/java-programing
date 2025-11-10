public class Exception {
    public static void main(String[]args){
        try{
        int a=10/0;
        System.out.println(a);
        }
       catch(ArithmeticException ae){
        System.out.println(" ArithmeticException");
       }
       catch(NullPointerException ne){
        System.out.println("null pointer exception");
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("aray out of bound exception");
       }
       finally{
        System.out.println(" finally handeled the exception");
       }
    }
}
