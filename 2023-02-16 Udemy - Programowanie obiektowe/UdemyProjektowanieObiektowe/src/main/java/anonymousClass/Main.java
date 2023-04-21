package anonymousClass;

public class Main {
    public static void main(String[] args) {

        PressAction a = new PressAction() {
            @Override
            public void action() {
                System.out.println("I am from anonymous class");
            }
        };


        PressAction a1 = () -> System.out.println("I am from anonymous class");

        Button  b = new Button();

        b.addAction(a);


    }
}

interface PressAction{
    void action();
}

class Button{

    void addAction(PressAction a){
        a.action();
    }

}
