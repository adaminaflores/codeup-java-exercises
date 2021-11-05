package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
//        ArrayList<Integer> grades = new ArrayList<>();


    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addGrades(int grade){
        grades.add(grade);

    }
    public double getGradeAverage(){
        double gradeSum = 0;
        for(int i : grades){
            gradeSum += i;
        }
        return gradeSum / grades.size();

    }

    public static void main(String[] args) {

//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<Integer> grades = new ArrayList<>();
        Student addie = new Student("addie", new ArrayList<>());
        ArrayList<String> name = new ArrayList<>();


        addie.grades.add(85);
        addie.grades.add(70);
        addie.grades.add(75);

        System.out.println("addie.getGradeAverage() = " + addie.getGradeAverage());

    }




}
