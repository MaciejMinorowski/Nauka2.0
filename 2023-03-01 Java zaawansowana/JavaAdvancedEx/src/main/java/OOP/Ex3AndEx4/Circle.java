package OOP.Ex3AndEx4;

public class Circle extends Shape{

    double radius;

    public Circle(){
        super();
        this.radius = 4;
    }

    public Circle(String colour, boolean isFilled, double radius){
        super(colour, isFilled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString(){
        return String.format("Circle with radius = %.2f which is a subclass of %s", radius, super.toString());


    }
}
