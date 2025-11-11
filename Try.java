public class Try {
    public static void main(String[]args){
    try{
        int data = 25/5;
        System.out.println(data);
    }
    catch(NullPointerException ne){
        System.out.println(ne); 
     }
     finally{
        System.out.println("no exception");
     }
    }
}
