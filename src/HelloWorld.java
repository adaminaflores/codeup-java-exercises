import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//1.Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
    int myFavoriteNumber = 19;
        System.out.println("This is an example of my integer being printed: " + myFavoriteNumber + "\n");
//2.Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "This is me creating a string variable \n";
            System.out.println("This is an example of my string printed out: " + myString + "\n");

//3.Change your code to assign a character value to myString. What do you notice?
//       String myString = 'c';   //already defined by the scope so won't display

//4.Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159;  //already defined by scope so will not display

//5.Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//6.Change your code to assign the value 3.14 to myNumber. What do you notice?
        double myNumber = 3.14;
            System.out.println("This is my example for printing out myNumber: " + myNumber); // wasn't able to print out with long. IntelliJ suggested using double instead.

//7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//8.Change your code to assign the value 123 to myNumber.
//
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //3.14 is a decimal and not an integer which doesn't include decimals.

//9.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//   float myNumber = 3.14;
//Need to use double instead of float.

//10.Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//Example of pre-increment above and post increment down below
        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//11.Try to create a variable named class. What happens? an Error that says it is not a statement.
//        var class;

//12.Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run? Code will not run because a string cannot be cast to a class of integer.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//13.Rewrite the following expressions using the relevant shorthand assignment operators:
         int m = 4;
//         m = m + 5;
         m += 5;
         System.out.println("4 + 5 = " + m);  // 9

         int n = 3;
         int o = 4;
//         o = o * n;
         o *= n;
         System.out.println("3 * 5 = " + o); // 12


         int q = 10;
         int r = 2;
//         q = q / r;
//         r = r - q;

         q /= r;
         r -= q;
         System.out.println("10 / 2 = " + q); // 5
         System.out.println("2 - 10 = " + r); // -3

//14.What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        System.out.println("-----------------");

//CONSOLE IO Curriculum

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);

//In the example above, the %s will be replaced with the value of the name variable, resulting in an output of: Hello there, codeup. Nice to see you.

        System.out.println("--------------------");

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }

}

