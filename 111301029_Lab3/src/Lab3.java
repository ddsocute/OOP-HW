import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("1 - A\n");

        Scanner sc = new Scanner(System.in);
        int ticket1 = sc.nextInt();
        int price1 = sc.nextInt();
        int ticket2 = sc.nextInt();
        int price2 = sc.nextInt();
        int budget1 = sc.nextInt();

        if (ticket1 * price1 + ticket2 * price2 >= budget1) {
            System.out.println("Not affordable");
        } else {
            System.out.println("$" + (budget1 - ticket1 * price1 - ticket2 * price2));
        }


        System.out.print("1 - B\n");

        int popcorn = sc.nextInt();
        String theater = sc.next();
        boolean isPopcorn;

        isPopcorn = popcorn == 1;
        if (isPopcorn) {
            System.out.println("go to the first floor and then " + directFloor(theater));
        } else {
            System.out.println(directFloor(theater));
        }
    }


    public static String directFloor(String theater) {
        switch (theater) {
            case "A":
            case "B":
                return "go to the second floor.";
            case "C":
                return "go to the third floor.";
            case "D":
                return "go to the fourth floor.";
            default:
                return "go to the fifth floor.";
        }
    }
}


