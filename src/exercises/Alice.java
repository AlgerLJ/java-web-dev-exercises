package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);

    }
}
