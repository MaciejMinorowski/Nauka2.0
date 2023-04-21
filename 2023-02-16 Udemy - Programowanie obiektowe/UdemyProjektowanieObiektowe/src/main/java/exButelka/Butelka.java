package exButelka;

public class Butelka {

    private double litres;
    private double capacity;


    Butelka(){       //Konstruktor domyślny - bezargumentowy
        capacity = 20.0;
    }

    Butelka(double litres, double capacity){
        this.litres = litres;
        this.capacity = capacity;
    }

    double getLitres(){
        return litres;
    }

    double getCapacity(){
        return capacity;
    }

    void pourIn(Double howMuch) {
        if (howMuch > (this.capacity - this.litres)) {
            this.litres += (this.capacity - this.litres);
        } else {
            this.litres += howMuch;
        }

    }

    void pourOut(Double howMuch){
        if (howMuch > this.litres){
            this.litres -= this.getLitres();
        } else {
            this.litres -= howMuch;
        }

    }

    void transfer(double howMuch, Butelka whereTo) {

        if (whereTo.litres == whereTo.capacity ){
            System.out.println("No more free capacity in bottle");
        }else if(this.getLitres() >= howMuch){
            this.pourOut(howMuch);
            whereTo.pourIn(howMuch);
        } else {
            whereTo.pourIn(this.getLitres());
            this.pourOut(this.getLitres());

        }

    }



    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[50]; // na tym etapi 3 NULL-e

        for (int i = 0; i < butelka.length; i++){
            butelka[i] = new Butelka(10, 20);
        }


        System.out.println("Bottle 0: " + butelka[0].getLitres());
        System.out.println("Bottle 1: " + butelka[1].getLitres());
        System.out.println();

        butelka[0].transfer(11,butelka[1]);

        System.out.println("Bottle 1: " + butelka[0].getLitres());
        System.out.println("Bottle 2: " + butelka[1].getLitres());
        System.out.println();

        butelka[0].transfer(5,butelka[1]);

        System.out.println("Bottle 0: " + butelka[0].getLitres());
        System.out.println("Bottle 1: " + butelka[1].getLitres());
        System.out.println();


        butelka[2].transfer(22,butelka[1]);

        System.out.println("Bottle 1: " + butelka[1].getLitres());
        System.out.println("Bottle 2: " + butelka[2].getLitres());
        System.out.println();

        butelka[0].transfer(5,butelka[2]);

        System.out.println("Bottle 0: " + butelka[0].getLitres());
        System.out.println("Bottle 2: " + butelka[2].getLitres());
        System.out.println();

    }
}
