import java.util.Scanner;

public class MethodsExercises {
    public static void calculate(int num1, int num2, String input) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("What would you like to calculate?");

        switch (input) {
            case "Addition":
                System.out.println("Add: " + (num1 + num2));
                // Fall through!
            case "Subtraction":
                System.out.println("Subtract: " + (num1 - num2));
                break;
            case "Multiplication":
                System.out.println("Multiply: " + (num1 * num2));
                break;
            case "Division":
                System.out.println("Divide: " + (num1 / num2));
                break;
            case "Modulus":
                System.out.println("Modulus: " + (num1 % num2));
                break;

        }

    }
}
