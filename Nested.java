public class Nested {
    public static void main(String[]args){
        try{
            try{
            int b = 10/0;
            System.out.println(b);
        }
        catch(ArithmeticException e){
       System.out.println(e);
        }
        try{
            int arr[]=new int[5];
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        catch(ArithmeticException w){
            System.out.println("handeled the exception ");
        }
      }
         catch(ArithmeticException e ){
         System.out.println("no exception");
        }
    }
}
