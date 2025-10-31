import java.util.Scanner;
public class Rock_papper_scisser {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissor game!");
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissor:");
        int game = sc.nextInt();
        switch(game){
            case 1 :
            System.out.println("You chose Rock");
            break;
            case 2 :
            System.out.println("You chose Paper");
            break;
            case 3 :
            System.out.println("You chose Scissor");
            break;
            default :
            System.out.println("Invalid choice ,please enter 1,2or 3");

        }
    }
}