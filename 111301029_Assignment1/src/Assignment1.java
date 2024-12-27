//this is the OOP asignmant 1


import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//        １
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[2];
        double[] height = new double[2];
        double[] weight = new double[2];
        String[] statement = new String[2];

        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.next();
            height[i] = scanner.nextDouble();
            weight[i] = scanner.nextDouble();
        }

        for (int i = 0; i < name.length; i++) {
            double BMI = Math.round((weight[i] / Math.pow(height[i] / 100, 2) * 100.0)) / 100.0;
            System.out.printf("%s‘s BMI is %.2f%n", name[i], BMI);
            if (BMI < 18.5) {
                statement[i] = "Underweight";
            } else if (BMI >= 18.5 && BMI < 24.0) {
                statement[i] = "Normal";
            } else {
                statement[i] = "Overweight";
            }
        }

        String linePrinted = "Their health status are ";
        for (int i = 0; i < name.length; i++) {
            linePrinted += statement[i];
            if (i < name.length - 1) {
                linePrinted += " and ";
            }
        }
        System.out.println(linePrinted);
//

//    2
        double TWDAED = 0.115;
        double TWDKRW = 41.6191;
        String[] currency = new String[3];
        double[] amount = new double[3];

        for (int i = 0; i < currency.length; i++) {
            amount[i] = scanner.nextDouble();
            currency[i] = scanner.next();
        }
        for (int i = 0; i < currency.length; i++) {
            switch (currency[i]) {
                case "TWD":
                    double TWDtoAED = Math.round(amount[i] * TWDAED * 100.0) / 100.0;
                    double TWDtoKRW = Math.round(amount[i] * TWDKRW * 100.0) / 100.0;
                    System.out.printf("%.2f TWD = %.2f AED = %.2f KRW%n", amount[i], TWDtoAED, TWDtoKRW);
                    break;
                case "AED":
                    double AEDtoTWD = Math.round(amount[i] / TWDAED * 100.0) / 100.0;
                    double AEDtoKRW = Math.round(amount[i] / TWDAED * TWDKRW * 100.0) / 100.0;
                    System.out.printf("%.2f AED = %.2f TWD = %.2f KRW%n", amount[i], AEDtoTWD, AEDtoKRW);
                    break;
                case "KRW":
                    double KRWtoTWD = Math.round(amount[i] / TWDKRW * 100.0) / 100.0;
                    double KRWtoAED = Math.round(amount[i] / TWDKRW * TWDAED * 100.0) / 100.0;
                    System.out.printf("%.2f KRW = %.2f TWD = %.2f AED%n", amount[i], KRWtoTWD, KRWtoAED);
                    break;
                default:
                    System.out.println("Unknown currency");
                    break;
            }
        }
    }
}
