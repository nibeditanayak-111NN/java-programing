import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side of square");
        double side=sc.nextDouble();
        double area=side*side;
        System.out.println("area of square is "+area);
    }
}
