package OOP.Ex3AndEx4;



public class Main {
    public static void main(String[] args){

//        Shape shape = new Shape();
//        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle1 = new Circle("blue",true, 8);

        System.out.println(circle1);

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Square square = new Square();
        Square square1 = new Square("red", true, 5.0);

        System.out.println(square);
        System.out.println(square1);

    }




}
