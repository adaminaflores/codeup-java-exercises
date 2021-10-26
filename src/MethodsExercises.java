import java.util.Scanner;

public class MethodsExercises {
    public static void userCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick two numbers, please!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Would you like to add, subtract, multiply, divide, orrr modulus?");
        String input = scanner.next();

        calculate(num1, num2, input);

    }
        public static void calculate ( int num1, int num2, String input){
            switch (input) {
                case "Addition":
                    System.out.println("Add: " + (num1 + num2));

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
