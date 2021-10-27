import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//A. While
//
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:
//
//5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//B. Do While
//
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//Alter your loop to count backwards by 5's from 100 to -10.
//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//            int x = 2;
//            do{
//                System.out.println("Count is: " + x);
//                x += 2;
//            } while (x <= 100);
//
//            int y = 100;
//            do{
//                System.out.println("Count is : " + y);
//                y -= 5;
//            } while(y >= -10);
//
//            long z = 2;
//            do{
//                System.out.println("Count is : " + z);
//                z *= z;
//            }while (z <= 1000000);

//C. For
//
//Refactor the previous two exercises to use a for loop instead.
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for(int x = 2; x <= 100; x +=2){
//            System.out.println(x);
//        }
//
//        for(int y = 100; y >= -10; y -= 5){
//            System.out.println(y);
//        }

//        for(int z = 2; z <= 1000000; z *= z){
//            System.out.println(z);
//        }

// 2. FizzBuzz
        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }

// 3. Display a table of powers.

        Scanner userInput = new Scanner(System.in);

//        System.out.print("Would you like to pick a number?");
//        String userResponse = userInput.nextLine();
//
//        if(userResponse.equalsIgnoreCase("yes")){
//            System.out.print("Nice! Pick a number from 1 - 100: ");
//            int userNumber = userInput.nextInt();
//            System.out.print("Let's get started! Here we have a table of cubes and squares");
//            System.out.print("\nNUMBER | SQUARED | CUBED");
//            System.out.print("~~~~~~~|~~~~~~~|~~~~~~~");
//
//            for(int i = 1; i <= 100; i++){
//                int userSquared = i*i;
//                int userCubed = i*i*i;



//4. Convert given number grades into letter grades.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

                System.out.print("Hey! What is your grade in class?");
                int userGrade = userInput.nextInt();

                if((userGrade <= 100) && (userGrade >= 88)){
                    if(userGrade >= 99){
                        System.out.println("Awesome! Your grade is an A+!");
                    }else{
                        System.out.println("Great Job! Your grade is an A-!");
                    }
                } else if(userGrade >= 80){
                    if(userGrade >= 87){
                        System.out.println("Nice Work! Your grade is a B+!");
                    }else{
                        System.out.println("Sweet! Your grade is a B-!");
                    }
                }else if(userGrade >= 67){
                    if(userGrade >= 79){
                        System.out.println("Keep going! Your grade is C+!");
                    }else{
                        System.out.println("Keep trying! Your grade is a C-!");
                    }
                }else if(userGrade >= 60){
                    if(userGrade >= 66){
                        System.out.println("Your grade is a D+, maybe schedule a one-on-one!");
                    }else{
                        System.out.println("Your grade is a D-. Definitely need to study!");
                    }
                }else{
                    System.out.println("Oh no! Your grade is an F :(");
                }


            }
        }








//    }
//}
