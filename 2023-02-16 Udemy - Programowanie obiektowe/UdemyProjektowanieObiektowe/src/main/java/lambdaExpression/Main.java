package lambdaExpression;

/*
Lambda expressions:

() -> {}

() - tu podajemy argumenty do przeslania funkcji
-> - strzałka szybka informacja że mamy do czynienia z wyrażeniem lambda
{} - treść wyrażenia
 */

public class Main {
    public static void main(String[] args) {



        PressAction a = () -> System.out.println("I am from anonymous class");

        PressAction a1 = new PressAction() {                                      // This actions equal lambda expression
            @Override
            public void action() {
                System.out.println("I am from anonymous class");
            }
        };


        ActionAfterClicking2 a2 = (int zA, int yA) -> {
            System.out.println(zA + yA);
        };

        Button b = new Button();

       // System.out.println(b.addAction2(5,15,a2));



    }
}

interface PressAction{
    void action();
}


interface ActionAfterClicking2{
    void action2 (int zA, int zB);
}

class Button{

    void addAction(PressAction a){
        a.action();
    }

    void addAction2(int zA, int yA, ActionAfterClicking2 z){
        z.action2(zA, yA);
    }

}
