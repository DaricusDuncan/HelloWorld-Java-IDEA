import java.io.Console;
import java.util.*;

public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scan.nextLine();
        System.out.print(userInput);

    }
}
