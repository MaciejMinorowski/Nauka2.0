package OOP.Ex5;

public class Main {
    public static void main(String[] args){

        Line line1 = new Line(10,10,20,20);

        System.out.println(line1.getLength());

        Line line2 = new Line(10,10,10,20);

        System.out.println(line2.getLength());

        System.out.println(line2.getMiddlePoint());

    }
}
