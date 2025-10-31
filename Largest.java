import java.util.Scanner;
public class Largest{
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the array size ");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("enter the elements of the array ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println("the array");
     
      int k=arr[0];
      for(int i=0;i<arr.length;i++){
     if ( k < arr[i]){
         k= arr[i];
        System.out.println (k+" the largest no");
      }
  }
 }
}
