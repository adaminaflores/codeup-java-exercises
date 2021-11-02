public class Employee extends Person {

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
