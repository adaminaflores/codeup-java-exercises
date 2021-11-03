import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        userCalculate();
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(getInteger(1,10));
        factorial();


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

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String isContinue;
        long factorial = 1;
        String middle = "1";

        do{
            userInput = getInteger(1,10);
            for(int i = 1; i <= userInput; i++){
                if(i > 1){
                    middle += "x" + i;
                }
                factorial *= i;
                System.out.printf("%2d! = %-45s = %d%n", i, middle, factorial);
            }
            System.out.println("Would you like to continue? ");
                isContinue = scanner.nextLine();

        }while(isContinue.equalsIgnoreCase("y"));

    }
    public void  dice() {
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("How many sides would you like this dice to have?");
        int sides = sc.nextInt();
        System.out.println("Would you like to roll the dice?");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            do {
                int dice1 = (int) Math.floor(Math.random() + sides);
                int dice2 = (int) Math.floor(Math.random() + sides);
                System.out.println(dice1);
                System.out.println(dice2);

                System.out.println("Would you like to roll the dice again?");
                answer = sc.nextLine();
            } while (answer.equalsIgnoreCase("y"));

        }


    }}
