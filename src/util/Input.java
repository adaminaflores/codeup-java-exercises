package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println();
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
            String s = getString();
            return Integer.valueOf(s);
        } catch(NumberFormatException nfe){
            System.out.println("Enter an Integer: ");
            return getInt();
        }

    }

    public int getInt(String prompt){
        int number;
        try{
            number = Integer.valueOf(getString(prompt));
            return number;
        }catch(NumberFormatException nfe) {
            System.out.println("Try again!");
            return getInt(prompt);
        }
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
        String s = getString();
        return Double.valueOf(s);
        } catch (NumberFormatException nfe){
            System.out.println("Enter a number: ");
            return getDouble();
        }
    }
    public double getDouble(String prompt){
        double number;
        try {
            number = Double.valueOf(getString(prompt));
            return number;
        }catch (NumberFormatException nfe){
            System.out.println("Try Again");
            return getDouble(prompt);
        }
    }

}
