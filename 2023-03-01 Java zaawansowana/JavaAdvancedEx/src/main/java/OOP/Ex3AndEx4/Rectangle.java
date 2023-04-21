package OOP.Ex3AndEx4;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(){
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(String colour, boolean isFilled, double length, double width) {
        super(colour, isFilled);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString(){
        return String.format("Rectangle with width = %.2f and length = %.2f which is a subclass of %s", width, length, super.toString());
    }


}
