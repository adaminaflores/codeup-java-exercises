public class Student {

    public String name;
    public String cohort;

    public Student(String studentName){
//        this.name = studentName;
//        this.cohort = "Unassigned";


        //Calling constructor inside of constructor
        this(studentName, "unassigned");

    }

    public Student(String studentName, String studentCohort){
        this.name = studentName;
        this.cohort = studentCohort;
    }

    public static void main(String[] args) {
        //Before constructors:

//        Student mcStudent = new Student();
//        mcStudent.name = "Ronald";
//        mcStudent.cohort= "Quasar";

//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort + " cohort");

        Student shanshan = new Student("Shanshan S.");

        System.out.println("shanshan.name = " + shanshan.name + " shanshan.cohort = " + shanshan.cohort);

        Student kenneth = new Student("Kenneth H.", "Deimos");
        System.out.printf("%s is the student name and %s is their cohort", kenneth.name, kenneth.cohort);
    }
}
