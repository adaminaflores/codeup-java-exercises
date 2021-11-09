package grades;

import java.util.ArrayList;

public class Student {
//    public double getGradeAverage;
    private String name;
    private ArrayList<Integer> grades;


    //constructor, has same name as class
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>(); // a new student arrives, make sure they have an area to store grades.
//        ArrayList<Integer> grades = new ArrayList<>();


    }
//    public void setName(String name){
//        this.name = name;
//    }
    //returns a student's name
    public String getName(){
        return this.name;
    }
    //adds the given grade to the grades property
    public void addGrades(int grade){
        this.grades.add(grade);

    }
    //returns the average of the students grades
    public double getGradeAverage(){
        double gradeSum = 0;
        for(int grade : this.grades){
            gradeSum += grade;
        }
        return gradeSum / this.grades.size();

    }

    public static void main(String[] args) {

//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<Integer> grades = new ArrayList<>();
        Student addie = new Student("addie");
        Student jackie = new Student("Jackie");
        Student mary = new Student("Mary");

        ArrayList<String> name = new ArrayList<>();


        addie.grades.add(85);
        addie.grades.add(70);
        addie.grades.add(75);


        System.out.println("addie.grades = " + addie.grades);
        System.out.println("addie.getGradeAverage() = " + addie.getGradeAverage());

    }




}
