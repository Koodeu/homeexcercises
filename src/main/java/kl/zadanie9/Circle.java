package kl.zadanie9;


import java.util.Arrays;
import java.util.List;

public class Circle implements Movable {

    Point2d center;
    Point2d point;

    public Circle(Point2d center, Point2d point) {
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
        this.center.setX(center.getX() + moveDirection.getX());
        this.center.setY(center.getY() + moveDirection.getY());
        this.point.setX(center.getX() + moveDirection.getX());
        this.point.setY(center.getY() + moveDirection.getY());
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



}
