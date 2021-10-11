import java.util.*;

public class MyHelloWorld {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        helloMethod(userInput);

    }

    public static void helloMethod(String input){
        System.out.println("Hello World!");
        System.out.println(input);
    }
}
