import java.util.Scanner;
public class For_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // print 0 to 100
        System.out.println("enter m");
        int m = sc.nextInt();
        for(int i=0; i<=m; i++){
            System.out.println(i);
        }
        //print 1st n number of odd numbers
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int j = 0; j <= n; j++){
            System.out.println(2*j + 1);
        }
        //print p number of natural numbers in reverse order
        System.out.println("enter p");
        int p = sc.nextInt();
        for(int k = p; k <= 0; k--){
            System.out.println(k);
        }
    }

}
