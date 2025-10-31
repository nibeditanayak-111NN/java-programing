import java.util.Scanner;
public class Solid_rectangle {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int m = sc.nextInt();
        System.out.println("enter number of columns");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
