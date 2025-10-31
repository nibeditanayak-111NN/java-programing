import java.util.Scanner;
public class Average {
public static void main (String[]args){
    
System .out.println("average mark of a student");
Scanner sc =new Scanner(System.in);

System.out.println("mark of science ");
float science= sc.nextFloat();

System.out .println("mark of odia ");
float odia=sc.nextFloat();

System.out.println("mark of English ");
float english=sc .nextFloat();

System.out.println("mark of history");
float history=sc.nextFloat();

System.out.println("mark of math");
float math= sc.nextFloat();
float sum=science+odia+english+history+math;
System.out.println(sum);
float average= (sum/5) ;
System.out.println("the average marks of a student is:"+average);
 }
}
