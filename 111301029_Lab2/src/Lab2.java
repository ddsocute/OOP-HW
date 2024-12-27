import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("1 - A");
        Scanner numScanner = new Scanner(System.in);
        System.out.print("Please input two numbers(use space to split):");
        int num1 = numScanner.nextInt();
        int num2 = numScanner.nextInt();

        System.out.println("Gap: " + Math.abs(num1 - num2));
        System.out.println("Mul: " + num1 * num2);
        System.out.println("Avg: " + (num1 + num2) / 2.0);
        System.out.println("Min: " + Math.min(num1, num2));

        System.out.println("\n1 - B");
        double randomnumber = Math.random() * Math.abs(num1 - num2) + Math.min(num1, num2);

        System.out.println("Random number between " + num1 + " and " + num2 + ":  " + (int) randomnumber);
        System.out.println("\n2.");
        String fullName = "JING-DI, LIN";
        System.out.println(fullName);
        String firstName = fullName.substring(0, 7);
        String lastName = fullName.substring(9, 12);
        System.out.println("The length of my first name \"" + firstName + "\" is " + firstName.length());
        System.out.println("The length of my last name \"" + lastName + "\" is " + lastName.length());
    }
}