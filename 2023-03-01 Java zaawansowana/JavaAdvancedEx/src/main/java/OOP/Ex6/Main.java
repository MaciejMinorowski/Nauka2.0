package OOP.Ex6;

public class Main {
    public static void main(String[] args){

    MovablePoint movablePoint1 = new MovablePoint(10,10,5,5);

        System.out.println(movablePoint1);

        movablePoint1.moveUp();
        movablePoint1.moveLeft();

        System.out.println(movablePoint1);

        MovableCircle movableCircle1 = new MovableCircle(15,15,5,5,4);

        System.out.println(movableCircle1);


    }
}
