public class Reverse_of_number {
    public static void main(String[]args){
        int num=345;
        int rev=0;
        int digit;;
       while(num>0){
        digit = num %10 ;
        rev = rev*10+digit;
        num = num/10;
       }
       System.out.println("sum of digits is:"+rev);
    }

}
