package Dziedziczenie;

/*
MONSTER:        klasa bazowa, rodzic, super-klasa

1. ZOMBIE       subklasy, dzieci, klasy pochodne
2. SKELETON


pola najczęściej ustawiamy na private,
a metody na protected

PROTECTED umozliwia rozszerzanie klasy spoza pakunków

 */


import Dziedziczenie.monsters.Monster;
import Dziedziczenie.monsters.Skeleton;
import Dziedziczenie.monsters.Zombie;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Skeleton(10,100); // rodzic moze wskazywac na dziecko

    //  Skeleton monster2 = new Monster(); // dziecko nie moze wskazywac na rodzica
        monster1.attack();

        System.out.println(monster1);









    }
}
