public class Employee extends Person {
    private String department;
    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }


    public Employee(String employeeName){
        super(employeeName);
    }
    public int getAge(){
        return this.age;
    }
    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you?");
    }
    public void doWOrk(){
        System.out.println("worky, worky, turkey, turkey..");
    }

    public static void main(String[] args) {

        Employee ken = new Employee("Ken");
        ken.sayHello();
        System.out.println("ken.name = " + ken.getName());
        ken.doWOrk();


    }


}
