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
        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for(int x = 2; x <= 100; x +=2){
            System.out.println(x);
        }

        for(int y = 100; y >= -10; y -= 5){
            System.out.println(y);
        }

//        for(int z = 2; z <= 1000000; z *= z){
//            System.out.println(z);
//        }

// 2. FizzBuzz






    }
}
