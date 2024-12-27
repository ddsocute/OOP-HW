import java.util.Scanner;


public class Lab4 {
    public static void main(String[] args) {
        System.out.println("Q1");
        Scanner sc = new Scanner(System.in);
        int layer = sc.nextInt();

        for (int i = 1; i <= layer; i++) {
            String printed = "";
            for (int j = i; j < layer; j++) {
                printed += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j += 1) {
                printed += "*";
            }
            System.out.println(printed);
        }

        for (int i = layer; i > 1; i--) {
            String printed = "";
            for (int j = i; j <= layer; j += 1) {
                printed += " ";
            }
            for (int j = 1; j <= 2 * (i-1) - 1; j++) {
                printed += "*";
            }
            System.out.println(printed);
        }
        System.out.println("Q2");
        int oddSum = 0;
        int evenSum = 0;
        double oddCount = 0;
        double evenCount = 0;
        double oddAvg ;
        double evenAvg ;
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
                evenCount += 1;
            } else {
                oddSum += number;
                oddCount += 1;
            }
        }
        evenAvg = evenSum / evenCount;
        oddAvg = oddSum / oddCount;
        String evenAvgFormatted = String.format("%.2f",evenAvg);
        String oddAvgFormatted = String.format("%.2f",oddAvg);
        System.out.println(oddSum + " " + oddAvgFormatted);
        System.out.println(evenSum + " " + evenAvgFormatted);
    }
}
