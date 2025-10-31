import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a:");
    int a = sc.nextInt();
    
    System.out.println("enter a:");
    int b = sc.nextInt();
    System.out.println("enter b:");
    int c = sc.nextInt();
    System.out.println("enter c");
    if(a>b&&a>c){
        System.out.println("a is greater");
    }
     else if (b>a&&b>c){
      System.out.println("b is greater");
    }
    else{
        System.out.println("c is greater");
    }
 }
}
