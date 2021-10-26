import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter statement : ");
        String userResponse = userInput.nextLine();
            if(userResponse.endsWith("?")){
                System.out.println("Sure.");
            } if(userResponse.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } if(userResponse.equals("")){
                    System.out.println("Fine. Be that way!");
            }else{
                    System.out.println("Whatever.");
            }

        }

        }


