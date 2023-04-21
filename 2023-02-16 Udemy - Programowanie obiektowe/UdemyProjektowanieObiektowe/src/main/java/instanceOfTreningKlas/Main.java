package instanceOfTreningKlas;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Worker("Maciej", "Minorowski", 4400);
        person[1] = new Student("Magdalena", "Czerwińska");

        for (Person p : person) {

            if (p instanceof Person) {                     // PIERWSZE UZYCIE EVER "INSTANCE OF" !!!!!!!!!!!
                ((Worker)p).pobierzOpis();                 // Downcasting - rzutowanie w dół
                ((Worker) p).working();
            }

        }
    }
}

abstract class Person {
    String name;
    String lastName;

    abstract void pobierzOpis();

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

class Worker extends Person {

    @Override
    void pobierzOpis() {
        System.out.println("I am a worker!");
        System.out.println("My name is: " + name);
        System.out.println("My last name is: " + lastName);
        System.out.println("My income is: " + income + " zlotych");
        System.out.println();
    }

    void working() {
        System.out.println("I am working!");
    }

    Worker(String name, String lastName, double income) {
        super(name, lastName);
        this.income = income;

    }

    double income;
}

class Student extends Person {

    @Override
    void pobierzOpis() {
        System.out.println("I am a student!");
        System.out.println("My name is: " + name);
        System.out.println("My last name is : " + lastName);
        System.out.println();
    }

    Student(String name, String lastName) {
        super(name, lastName);
    }
}



