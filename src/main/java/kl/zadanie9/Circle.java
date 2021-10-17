package kl.zadanie9;


import java.util.Arrays;
import java.util.List;

public class Circle implements Movable, Resizable{

    Point2d center;
    Point2d point;

    public Circle(Point2d center, Point2d point) {
        this.center=center;
        this.point=point;
    }

    public Point2d getCenter() {
        return center;
    }

    public Point2d getPoint() {
        return point;
    }

    public double getRadius(Point2d center, Point2d point) {

        return Math.sqrt(Math.abs(point.getX() - center.getX()) + point.getY() - center.getY());
    }

    public double getPerimiter(Point2d center, Point2d point) {
        return 2 * Math.PI * (Math.sqrt(Math.abs(point.getX() - center.getX()) + point.getY() - center.getY()));
    }
    public double getArea(Point2d center, Point2d point){
        return Math.PI*Math.pow(Math.sqrt(Math.abs(point.getX() - center.getX()) + point.getY() - center.getY()), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.setX(this.center.getX() + moveDirection.getX());
        this.center.setY(this.center.getY() + moveDirection.getY());
        this.point.setX(this.point.getX() + moveDirection.getX());
        this.point.setY(this.point.getY() + moveDirection.getY());

    }

    @Override
    public void resize(double resizeFactor) {
     double resizedPointX = point.getX()*resizeFactor;
     double resizedPointY = point.getY()*resizeFactor;
     point = new Point2d(resizedPointX, resizedPointY);
     Circle circle = new Circle(center,point);
    }

    //    public List getSlicePoints (Point2d circlePoint){
//        double point1;
//        double point2;
//        double point3;
//
//
//
//        return Arrays.asList(point1, point2, point3);
//
//
//    }


    public void setCenter(Point2d center) {
        this.center = center;
    }

    public void setPoint(Point2d point) {
        this.point = point;
    }
}
