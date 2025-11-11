import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt");
        System.out.println("File opened successfully!");
    }
}
