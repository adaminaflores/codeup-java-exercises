public class Person {
    private String name;

    public Person(String name){
            this.name = name;
    }


    public String getName(){
//TODO: return the person's name
        return name;

    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;



    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("%s says hello!", this.name);



        }
    public static void main(String[] args) {
        Person addie = new Person("Addie");
        addie.name = "Addie";
        System.out.printf("%s says hello!%n", addie.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  //true
//        System.out.println(person1 == person2);  //false

//        Person person1 = new Person("John");
//        Person person2 = person1;// this is redundant
//        System.out.println(person1 == person2);  //true

        Person person1 = new Person("John");
        Person person2 = person1; // Code will run but this is redundant.
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //John //John comes out

        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //Jane //Jane comes out
    }

}
