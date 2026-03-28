import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name, laddy ?");
        String userName = scanner.nextLine();
        System.out.println("Welcome, " + userName + "!");
        
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java programming using copilot.");
        
        System.out.print("Enter a value for variableA: ");
        int variableA = scanner.nextInt();
        int variableB = 20;
        System.out.println(variableA + variableB);
    }   

}
