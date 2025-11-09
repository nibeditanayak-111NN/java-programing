import java.util.Scanner;
public class EvenOdd{
    public static void main (String[]args){
        System.out.println("taking input from user ");
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        if(a%2==0){
        System.out.println("the number is even");
        }else{
        System.out.println("the number is odd");
     }
    }
}

