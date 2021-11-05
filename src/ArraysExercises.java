import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addNewPerson(Person[] Person, Person name){
        Person[] newPerson = Arrays.copyOf(Person , Person.length +1 );
        newPerson[newPerson.length -1] = name;
        return newPerson;

        }

    public static void main(String[] args) {
        Person[] Person = new Person[3];
        Person[0] = new Person("Addie");
        Person[1] = new Person("Ian");
        Person[2] = new Person("Jackie");
        Person Nick = new Person("Nick");


        Person = addNewPerson(Person, Nick);
        for(Person name : Person){
            System.out.println(name.getName());
        }



    }

    }




