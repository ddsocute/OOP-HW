import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please input the radius of the circle1: ");
        int radius = inputScanner.nextInt();
        System.out.print("Please enter xy-coordinate of center for " +
                "the circle1 (separated by spaces): ");
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        System.out.print("please enter the xy-coordinate of the point: ");
        int point_x = inputScanner.nextInt();
        int point_y = inputScanner.nextInt();
        Circle circle1 = new Circle(x, y, radius);
        Circle circle2 = new Circle(0, 0, 5);

        System.out.printf("The area of the circle1 is %.2f \n", circle1.area());
        System.out.printf("The circumference of the circle1 is %.2f \n"
                , circle1.circumference());
        System.out.println("The relationship between point and circle:"
                + circle1.rangePoint(point_x, point_y));
        System.out.print("The relationship between the two circles:"
                + circle1.rangeCircle(circle2));
    }
}