import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!!");
        int myNumber = (int)Math.floor(Math.random() * 100);
        int userInput;

        System.out.println("Guess what number I have chosen!");

        do{
            System.out.println("Pick a number between 1 - 100: ");
            userInput = scanner.nextInt();
            if(userInput > myNumber){
                System.out.println("LOWER");
            }else if(userInput < myNumber){
                System.out.println("HIGHER");
            }else{
                System.out.println("GREAT GUESS");
            }
        }while(userInput != myNumber);
    }
}
