import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1");
        System.out.print("Please enter grades:");
        int validNumber = 0;
        double total = 0;
        double sumsq = 0, stddev = 0;
        int aplus = 0, a = 0, aminus = 0, bplus = 0, b = 0, bminus = 0, cplus = 0, c = 0, cminus = 0, d = 0, f = 0;
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number >= 0 && number <= 100) {
                validNumber += 1;
                total += number;
                sumsq += number * number;
                if (number >= 98 && number <= 100) {
                    aplus += 1;
                } else if (number >= 92 && number < 98) {
                    a += 1;
                } else if (number >= 90 && number < 92) {
                    aminus += 1;
                } else if (number >= 88 && number < 90) {
                    bplus += 1;
                } else if (number >= 82 && number < 88) {
                    b += 1;
                } else if (number >= 80 && number < 82) {
                    bminus += 1;
                } else if (number >= 78 && number < 80) {
                    cplus += 1;
                } else if (number >= 72 && number < 78) {
                    c += 1;
                } else if (number >= 70 && number < 72) {
                    cminus += 1;
                } else if (number >= 60 && number < 70) {
                    d += 1;
                } else {
                    f += 1;
                }
            }
        }
        double average = total / validNumber;
        stddev = (sumsq - total * total / validNumber) / validNumber - 1;
        System.out.println("You enter " + validNumber + " valid grades from 0 to 100.");
        System.out.printf("The average = %.2f with a standard deviation =  %.2f\n",average,Math.sqrt(stddev));
        System.out.printf("The grade distribution is:\nA+ = %d\nA = %d\nA- = %d\nB+ = %d\nB = %d\nB- = %d\n" +
                "C+ = %d\nC = %d\nC- = %d\nD = %d\nF = %d\n", aplus, a, aminus, bplus, b, bminus, cplus, c, cminus, d, f);

        System.out.println("Q2");
        Scanner sc2 = new Scanner(System.in);
        boolean isFirst = true;
        int numberFirst = sc2.nextInt();
        int numberEnd = numberFirst;
        int x, y, z;
        while (numberEnd != 495) {
            if (numberEnd < 10) {
                z = numberEnd % 10;
                y = 0;
                x = 0;
            } else if (numberEnd < 100) {
                z = numberEnd % 10;
                y = (numberEnd % 100 - z) / 10;
                x = 0;
            } else {
                z = numberEnd % 10;
                y = (numberEnd % 100 - z) / 10;
                x = (numberEnd % 1000 - z - (numberEnd % 100 - z)) / 100;
            }
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (x > z) {
                int temp = x;
                x = z;
                z = temp;
            }
            if (y > z) {
                int temp = y;
                y = z;
                z = temp;
            }
            numberEnd = (100 * z + 10 * y + x) - (100 * x + 10 * y + z);

            if (isFirst == false){
                System.out.print(", " + numberEnd);
            }else{
                System.out.print(numberEnd);
                isFirst = false;
            }
        }
    }
}
