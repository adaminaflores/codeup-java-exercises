import java.util.Arrays;

public class PersonLecture {

    //instance variables

    public String firstname;
    public String lastname;
    public int age;


    //instance method
    public String joinChat(){
        return lastname + " , " + firstname + " has joined the chat";
    };

    //make a static property  - representing the worl population
    public static long worldPop = 7_900_000_000L;

    public static void main(String[] args) {
        PersonLecture addie = new PersonLecture();

        addie.firstname = "Addie";
        addie.lastname = "Flores";
        System.out.println("addie = " + addie);
        System.out.println(addie.firstname + " " + addie.lastname + " is my name!" );
        System.out.printf("%s %s is my name!%n", addie.firstname, addie.lastname);

        System.out.println(addie.joinChat());

        System.out.println("worldPop = " + worldPop);

//let's add doug to worldPop:

        PersonLecture douglas = new PersonLecture();
        douglas.firstname = "Douglas";
        douglas.lastname = "Hirsh";

        PersonLecture.worldPop += 1;
        System.out.println("worldPop with Doug: = "+ worldPop) ;


    }
}
