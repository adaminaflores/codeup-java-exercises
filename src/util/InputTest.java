package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String myString = input.getString();
        System.out.println("myString = " + myString);

        System.out.println("Are you hungry?");
        boolean youHungry = input.yesNo();
        System.out.println("youHungry = " + youHungry);

        System.out.println("Enter a whole number: ");
        int myInt = input.getInt();
        System.out.println("myInt = " + myInt);

        int myInt2 = input.getInt(1,100);
        System.out.println("myInt2 = " + myInt2);


        System.out.println("Enter a decimal number: ");
        double myDouble = input.getDouble();
        System.out.println("myDouble = " + myDouble);

       double myDouble2 = input.getDouble(1,100);
        System.out.println("myDouble2 = " + myDouble2);

        String myString2 = input.getString("Please enter a string: ");
        System.out.println("myString2 = " + myString2);

        boolean isContinue = input.yesNo("Do you want to continue? ");
        System.out.println("isContinue = " + isContinue);

        int myInt3 = input.getInt(1,10, "Enter a whole number between 1 and 10: ");
        System.out.println("myInt3 = " + myInt3);

        int myInt4 = input.getInt("Enter a whole number: ");

        double myDouble3 = input.getDouble("Enter a decimal number: ");
        System.out.println("myDouble3 = " + myDouble3);

        double myDouble4 = input.getDouble(1,10, "Enter a decimal number :");
        System.out.println("myDouble4 = " + myDouble4);



    }


}
