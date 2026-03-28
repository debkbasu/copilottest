import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java programming.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for variableA: ");
        int variableA = scanner.nextInt();
        int variableB = 20;
        System.out.println(variableA + variableB);
    }   

}
