import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        userCalculate();
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }
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
                case "add":
                    System.out.println("Add: " + (num1 + num2));

                case "subtract":
                    System.out.println("Subtract: " + (num1 - num2));
                    break;
                case "multiply":
                    System.out.println("Multiply: " + (num1 * num2));
                    break;
                case "divide":
                    System.out.println("Divide: " + (num1 / num2));
                    break;
                case "modulus":
                    System.out.println("Modulus: " + (num1 % num2));
                    break;

            }


        }
    public static int getInteger(int min, int max){
       Scanner scanner = new Scanner(System.in);
       int userInput = scanner.nextInt();
       if(userInput <= max && userInput >= min) {
           return userInput;
       }else{
           System.out.printf("Enter a number between %d - %d: \n", min, max);
           return getInteger(min, max);
       }
    }
    }
