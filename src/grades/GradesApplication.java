package grades;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
      HashMap<String, Student> students = new HashMap<>();
      Scanner scanner = new Scanner(System.in);

      Student Addie = new Student("Addie");
      students.put("adaminaflower$", Addie);

      Addie.addGrades(90);
      Addie.addGrades(80);
      Addie.addGrades(50);


      Student Perry = new Student("Perry");
      students.put("perryThePlatypus" , Perry);

      Perry.addGrades(100);
      Perry.addGrades(90);
      Perry.addGrades(80);


      Student Rhiannon = new Student("Rhiannon");
      students.put("rhiannonIsCool", Rhiannon);

      Rhiannon.addGrades(100);
      Rhiannon.addGrades(100);
      Rhiannon.addGrades(100);



      Student Jackie = new Student("Jackie");
      students.put("DallasInWonderland", Jackie);

      Jackie.addGrades(100);
      Jackie.addGrades(90);
      Jackie.addGrades(100);


      Student Ian = new Student("Ian");
      students.put("AlrightAlrightAlright", Ian);

      Ian.addGrades(90);
      Ian.addGrades(80);
      Ian.addGrades(90);



        // we need a command line application- search inside HashMap, if theyt want to search again, we need to create a loop. bool flag.

        boolean promptFlag = true;

      System.out.println("Welcome!");
      while(promptFlag){
        System.out.println("Here is are the GitHub usernames of students: ");
        String message = " | ";
        for(String ghName : students.keySet()){
          message += ghName + " | ";
        }
        System.out.println(message);
        System.out.println("Which student would you like more info on?");

        String userSearch = scanner.nextLine();

        Student searchResult = students.get(userSearch);

        if(searchResult == null){
          System.out.printf("No result found", userSearch);
        } else {
          System.out.printf("Match found for %s. %s is the name of the student. Here is their current grade average : %s%n ", userSearch, searchResult.getName(), searchResult.getGradeAverage());
        }
        System.out.println("Would you like to search again? (y/n)");
        String userResponse = scanner.nextLine();
        if(userResponse.equalsIgnoreCase("y")){
          promptFlag = true;
        }else {
          System.out.println("Thanks, have a good one!");
          promptFlag = false;
        }
      }


//        do {
//          System.out.println("Welcome! Here is a list of some Students github accounts: ");
//          System.out.println("| adaminaflower$ | perryThePlatypus | rhiannonIsCool | DallasInWonderland | AlrightAlrightAlright |");
//          System.out.println("If there is a student you want more info on, enter username here: ");
//            Input input = new Input();
//            String userInput = input.getString();
//            System.out.println(userInput);
//            if(students.containsKey(userInput)){
//              System.out.println("Student Name: " + students.get(userInput).getName());
//            } else {
//              System.out.println("Oh no! We have no students with that name!");
//            }
//            System.out.println("Would you like to search for another student? (y/n)");
//             promptFlag = input.getString().equalsIgnoreCase("y");
//
//        } while (promptFlag);

    }

}
