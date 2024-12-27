import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the two sides of the " +
                "triangle:");
        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        System.out.print("Please enter the angle of the triangle:");
        double angleC = sc.nextDouble();
        double sideC = side(sideA, sideB, angleC);
        System.out.println("The other side length is "
                + sideC + ".");
        System.out.println("The perimeter of the triangle is "
                + perimeter(sideA, sideB, sideC) + ".");
        System.out.println("The area of the triangle is " +
                area(sideA, sideB, sideC) + ".");
    }

    public static double side(double sideA, double sideB, double angleC) {
        double squareSideC = sideA * sideA + sideB * sideB
                - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC));
        double sideC = Math.sqrt(squareSideC);
        return sideC;
    }

    public static double perimeter(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public static double area(double sideA, double sideB, double sideC) {
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }
}