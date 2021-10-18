package kl.zadanie9;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppCircleCalcs {
    public static void main(String[] args) {

        Point2d centre = new Point2d(5,4);
        Point2d point = new Point2d(8,8);
        Circle circle = new Circle(centre, point);

        System.out.println("Długość promienia to: " + circle.getRadius(centre, point));
        System.out.println("Obwód okręgu to: "+ circle.getPerimiter(centre, point));
        System.out.println("Pole okręgu to: "+ circle.getArea(centre, point));

        System.out.println("Wpółrzędne punktu przed przesunięciem: X: "+ centre.getX() + ", Y: " +centre.getY());

        MoveDirection moveDirection1 = new MoveDirection(15,21);
        centre.move(moveDirection1);
        System.out.println("Wpółrzędne punktu po przesunięciu: X: "+ centre.getX() + ", Y: " +centre.getY());

        System.out.println(circle.center.getX() + " " + circle.center.getY());

    }

}
