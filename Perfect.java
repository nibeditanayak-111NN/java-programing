import java.util.Scanner;
public class Perfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if (n%i==0){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        if(sum==n){
         System.out.println("the number is perfect number :"+n);
        }
        else{
            System.out.println("the number is not perfect :"+n);
        }
    }
}
