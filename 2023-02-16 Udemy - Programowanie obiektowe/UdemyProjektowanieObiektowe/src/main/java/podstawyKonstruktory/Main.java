package podstawyKonstruktory;

public class Main {
    public static void main(String[] args) {


        Punkt p;

        p = new Punkt(10,25);           // to są "ARGUMENTY"

        p.x = 5;
        p.y = 20;

        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);


    }
}

class Punkt {

    int x;
    int y;

    Punkt(){
        System.out.println("Wywolano kostruktor domyslny");
        x = 20;
        y = 20;
    }

    Punkt(int x, int y){             // to są "PARAMETRY" - tymczasowe zmienne, ktorych cykl zycie konczy
                                                // sie w momencie konca wywolywania konstruktora

        // int pierwszy; - to się dzieje w nawiasie
        // int drugi; - to się dzieje w nawiasie

        System.out.println("Wywolano kostruktor z dwoma parametrami");


        this.x = x; // this oznacza odwolanie sie do konkretnego obiektu (p):  Punkt p = new Punkt(10,25);
        this.y = y;
    }
        // tzn. 'this' zmienia swoją postać w zależności od tego na jakim obiekcie operujesz.
        // 'this' to obiekt na którym aktualnie operujesz.





}