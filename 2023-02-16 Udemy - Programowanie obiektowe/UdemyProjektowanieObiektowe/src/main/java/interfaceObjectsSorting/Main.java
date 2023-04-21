package interfaceObjectsSorting;

/*
    Interfejsy tworzy się głównie po to bu narzucić na klasy pewne zachowania - Implementacja



 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Interface1 a = new Worker(4400);

        ((Worker)a).getIncome();  // Dostep do metod Workera poprzez downcasting z Interface do Worker

        int[] tab = new int[3];
        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;
        Arrays.sort(tab);
        System.out.println(tab[0]);

        Worker[] worker = new Worker[3];

        worker[0] = new Worker(10000);
        worker[1] = new Worker(6000);
        worker[2] = new Worker(3000);

        Arrays.sort(worker, Collections.reverseOrder());

        System.out.println(worker[0].compareTo(worker[1]));

        for (Worker w: worker){
            System.out.println(w.getIncome());
        }





    }
}


interface Interface1 {
    double PI = 3.14; // public static and final

    void something(); //public abstract
}

interface Interface2 {

}

class Worker implements Interface1, Interface2, Comparable {     // Implementowac mozna wiele interfejsów naraz, w przeciwienstwie
    // do extendowania klas - tylko z jednej mozna dziedziczyć
    private double income;

    Worker(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    @Override
    public void something() {
        System.out.println("Intarface induced method");
    }


    @Override
    public int compareTo(Object o) {
        Worker sent = (Worker)o;
        if (this.income < sent.income){
            return -1;
        } else if(this.income > sent.income ){
            return 1;
        } else {
            return 0;
        }
    }
}
