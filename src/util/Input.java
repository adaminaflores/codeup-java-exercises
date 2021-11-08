package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string.");
        return this.scanner.nextLine();

    }
    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }
    public int getInt(){
        try {
            String userInput = getString();
            return Integer.parseInt(userInput);
        } catch(Exception e){
            System.out.println("Sorry! You need to enter a number");
            e.printStackTrace();
            e.getMessage();

            return getInt();
        }

    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max){
        int userInt;
        do{
            System.out.printf("Enter a whole number between %d and %d: %n", min, max );
            userInt = this.scanner.nextInt();
        }while(userInt > max || userInt < min);

        return userInt;
    }

    public int getInt(int min, int max, String prompt){
        int userInt;
        do{
            System.out.println(prompt);
            userInt = this.scanner.nextInt();

        }while(userInt > max || userInt < min);
        return userInt;
    }

    public double getDouble(double min, double max){
        double userDouble;
        do{
            System.out.printf("Enter a decimal number between %f and %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
        }while(userDouble > max || userDouble < min);
        return userDouble;
    }

    public double getDouble(double min, double max, String prompt){
        double userDouble;
        do{
            System.out.println(prompt);
            userDouble = this.scanner.nextDouble();
        }while (userDouble > max || userDouble < min);
        return userDouble;
    }

    public double getDouble(){
        try{
        String userInput = getString();
        return Integer.parseInt(userInput);
        } catch (Exception e){
            System.out.println("Sorry! You need to enter a number");
            e.printStackTrace();
            e.getMessage();
            return getDouble();
        }
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

}
