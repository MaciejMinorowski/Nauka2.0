package Dziedziczenie.monsters;

public class Skeleton extends Monster{


    public void attack(){

        super.attack();
        // Domyślna implementacja metody atakuj
        System.out.println("To jest metoda atakuj z klasy Skeleton");
    }

    String typeOfWeapon;

    @Override
    void opis() {

    }

    public Skeleton() {
        System.out.println("Domyślny konstruktor z klasy Skeleton");
    }

    public Skeleton(double speed, double HP) {
        super(speed, HP);
        System.out.println("Nie-domyślny konstruktor z klasy Skeleton z dwoma argumentami");
    }

    public Skeleton(double speed, double HP, String typeOfWeapon){
        super(speed, HP);
        this.typeOfWeapon = typeOfWeapon;
        System.out.println("Nie-domyślny konstruktor z klasy Skeleton");

    }

    public String getTypeOfWeapon(){
        return typeOfWeapon;

    }

    public String toString(){

        return "Skeleton{" + " speed= " + speed + " HP= " + HP + " type of weapon: " + typeOfWeapon + "}" ;
    }
}
