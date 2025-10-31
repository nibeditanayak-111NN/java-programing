import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        System.out.println("enter a number ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int original = num ;
        int reverse=0;
        int digit=0;
        while (num !=0){
            digit = num%10;
            reverse = reverse*10+digit ;
            num = num/10;
        }
        if( original== reverse){
            System.out.println("the number is palindrome "+original);
        }
        else{
            System.out.println("the number is not palindrome "+original);
        }
        // if digit is even add 5 to the degit else add 10 to the digit and get the result
reverse=0;
digit=0;
        while (original!=0){
           digit = original%10;
           if(digit%2==0){
               digit= digit +5;
reverse=reverse*10+digit;
           }
           else {
               digit = digit+10;
reverse=reverse*10+digit;
           }
        original=original /10;   
        
             }
             System.out.println (reverse);
     
    }


}