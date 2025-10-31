public class Sod {
    public static void main(String[]args){
        int num=345;
        int sum=0;
        int digit;;
       while(num>0){
        digit = num %10 ;
        sum = sum+digit;
        num = num/10;
       }
       System.out.println("sum of digits is:"+sum);
    }
}
