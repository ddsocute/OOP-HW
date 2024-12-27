import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String filePathRead = "Sales Data.txt";
        Fruit apple = new Fruit("apple", 10, 15);
        Fruit banana = new Fruit("banana", 5, 10);
        Fruit orange = new Fruit("orange", 20, 35);
        Shop shop = new Shop();

        try (Scanner sc = new Scanner(new File(filePathRead))){
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while(sc.hasNextLine()){
                shop.addOrder(apple, sc.nextInt());
                shop.addOrder(banana, sc.nextInt());
                shop.addOrder(orange, sc.nextInt());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        String report = shop.getReport();
        System.out.print(report);

        String filePathWrite = "shop_report.txt";
        try(FileWriter writer = new FileWriter(new File(filePathWrite))){
            writer.write(report);
            System.out.println("Report has been written to shop_report.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
