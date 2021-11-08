package grades;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
      HashMap<String, Student> students = new HashMap<>();
      Scanner scanner = new Scanner(System.in);

      Student Addie = new Student("Addie", new ArrayList<>());
      students.put("adaminaflower$", Addie);

      Addie.addGrades(90);
      Addie.addGrades(80);
      Addie.addGrades(50);


      Student Perry = new Student("Perry", new ArrayList<>());
      students.put("perrytThePlatypus" , Perry);

      Perry.addGrades(100);
      Perry.addGrades(90);
      Perry.addGrades(80);


      Student Rhiannon = new Student("Rhiannon", new ArrayList<>());
      students.put("rhiannonIsCool", Rhiannon);

      Rhiannon.addGrades(100);
      Rhiannon.addGrades(100);
      Rhiannon.addGrades(100);



      Student Jackie = new Student("Jackie", new ArrayList<>());
      students.put("DallasInWonderland", Jackie);

      Jackie.addGrades(100);
      Jackie.addGrades(90);
      Jackie.addGrades(100);


      Student Ian = new Student("Ian", new ArrayList<>());
      students.put("AlrightAlrightAlright", Ian);

      Ian.addGrades(90);
      Ian.addGrades(80);
      Ian.addGrades(90);





        boolean prompt = true;
        do {
          System.out.println("Welcome! Here is a list of some Students github accounts: ");
          System.out.println("| adaminaflower$ | perryThePlatypus | rhiannonIsCool | DallasInWonderland | AlrightAlrightAlright |");
          System.out.println("If there is a student you want more info on, enter username here: ");
            Input input = new Input();
            String userInput = input.getString();
            System.out.println(userInput);
            if(students.containsKey(userInput)){
              System.out.println("Student Name: " + students.get(userInput).getName());
            } else {
              System.out.println("Oh no! We have no students with that name!");
            }
            System.out.println("Would you like to search for another student? (y/n)");
             prompt = input.getString().equalsIgnoreCase("y");

        } while (true);

    }

}
