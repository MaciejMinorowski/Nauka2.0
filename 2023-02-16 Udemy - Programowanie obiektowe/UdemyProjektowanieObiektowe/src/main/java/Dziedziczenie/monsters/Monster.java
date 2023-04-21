package Dziedziczenie.monsters;


    /*
    KLASY ABSTRAKCYJNE:
    - po pierwsze nie tworzą obiektów w swoim typie
    - razem z metodami abstrakcyjnymi tworzą swoiste narzędzie do narzucania pewnych obowiązkowych cech/wymogów
      dla klas pochodnych/dziedziczących
    - choćby przeto to, że motada abstrakcyjna klasy abstrakcyjnej musi znajdować się w każdej klasie pochodnej
    - metody abstrakcyjne nie posiadają ciała, klasy abstakcyjne nie posiadają obiektów
    */

public abstract class Monster {
    protected double speed = 10;
    protected double HP;

    abstract void opis();



    public Monster(){
        System.out.println("Domyślny konstruktor z klasy Monster");

    }
    public Monster(double speed, double HP){
        this.speed = speed;
        this.HP = HP;
        System.out.println("Nie-domyślny konstruktor z klasy Monster");
    }






    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getHP(){
        return HP;
    }
    public void setHP(){
        this.HP = HP;
    }


    public void attack(){

        // Domyślna implementacja metody atakuj
        System.out.println("To jest metoda atakuj z klasy Monster");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "speed=" + speed +
                ", HP=" + HP +
                '}';
    }
}
