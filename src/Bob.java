import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's Talk to Bob: ");

        String userResponse = userInput.nextLine();

            if (userResponse.endsWith("?")) {
                System.out.println("Bob: Sure.");
            }
            if (userResponse.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            }
            if (userResponse.equals("")) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");

            }

        }

    }





