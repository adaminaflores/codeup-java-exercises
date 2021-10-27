import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pi = 3.14159;
        String piString = "The value of pi is approximately: ";
        System.out.format("%s %.2f%n",piString, pi);



        System.out.print("What is your favorite number?");
        int userInput = scanner.nextInt();
        System.out.print("What year were you born?");
        int userInput1 = scanner.nextInt();


        System.out.print("Enter 3 of your favorite words: ");
        String userInput2 = scanner.nextLine();
        System.out.printf("Your favorite words are: ", userInput2);


        scanner.nextLine();
        System.out.print("What is your favorite thing to do?");
        String userFavorite = scanner.nextLine();
        System.out.printf("That's awesome! Sounds like a lot of fun!");


        scanner.nextLine();
        System.out.print("What is the length of the classroom you are in?");
        int userLength = scanner.nextInt();
        System.out.print("What is the width of the classroom?");
        int userWidth = scanner.nextInt();
        int userArea = userLength * userWidth;
        int userPerimeter = 2 * (userLength + userWidth);
        System.out.printf("The area of your room is %s sqFt." , userArea);
        System.out.printf("\nThe perimeter of your room is %s ft.", userPerimeter);











    }

}
