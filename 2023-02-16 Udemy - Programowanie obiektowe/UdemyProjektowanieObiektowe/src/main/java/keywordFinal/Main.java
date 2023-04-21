package keywordFinal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


    }
}

// KLASA moze byc final - wtedy nic nie moze po niej dziedziczyć, sluzy np jako secuirty measure

/* final */ class Person {

}

class Worker extends Person {

    final Date dateOfEmployment = new Date(); // pole moze byc final jesli nie chcemy zeby w przyszloscie zostala zmieniona


    final Date getDateOfEmployment() {        //metody final nie mogą być overridden
        return dateOfEmployment;
    }
}

class Programista extends Worker {

//    Date getDateOfEmployment() {
//        return dateOfEmployment;
//    }

}
