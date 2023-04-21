package OOP.Ex5;

import OOP.Ex1.Point2D;

public class Line {
    Point2D point1;
    Point2D point2;

    public Line(Point2D point1, Point2D point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(float x1, float y1, float x2, float y2){
        this.point1 = new Point2D(x1,y1);
        this.point2 = new Point2D(x2,y2);
    }

    public Point2D getPoint1(){
        return point1;
    }
    public Point2D getPoint2(){
        return point2;
    }

    public void setPoint1(Point2D point1){
        this.point1 = point1;
    }

    public void setPoint2(Point2D point2){
        this.point2 = point2;
    }

    public float getLength(){
       return (float) Math.sqrt(
               (Math.pow(point2.getX() - point1.getX(), 2)
                       + Math.pow(point2.getY() - point1.getY(), 2)));



    }

    public Point2D getMiddlePoint(){
        float middleX = (point2.getX() + point1.getX()) / 2;
        float middleY = (point2.getY() + point1.getY()) / 2;
        return new Point2D(middleX,middleY);

    }

}
