import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Lab7 {
    //      initialize  constant
    private static final int LIST_LENGTH = 4;

    public static void main(String[] args) {
//        input
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Create the list with 5 names: ");
        String inputName = sc.nextLine();
        String[] names = inputName.split(" ");
        nameList.addAll(Arrays.asList(names));
        while (nameList.size() > 4){
            nameList.remove(0);
        }
        System.out.print("The name to check existence: ");
        String existence = sc.nextLine();
        System.out.print("The name to find index: ");
        String findIndex = sc.nextLine();
        System.out.print("The name to find name: ");
        int findName = sc.nextInt();

//        existence
        int existenceCount = 0;
        for (String name : nameList) {
            if (existence.equals(name)) {
                existenceCount += 1;
            }
        }
        if (existenceCount > 0) {
            System.out.printf("The Arraylist contains %s\n", existence);
        } else {
            System.out.printf("The Arraylist does not contain %s\n", existence);
        }


////        find index
        int indexCount = -1;
        for (int i = 1; i <= LIST_LENGTH; i++) {
            if (findIndex.equals(nameList.get(i - 1))) {
                indexCount = nameList.indexOf(findIndex);
            }
        }
        if (indexCount > -1) {
            System.out.printf("The index of %s is %d\n",findIndex, indexCount);
        } else {
            System.out.printf("The Arraylist does not contain %s\n", findIndex);
        }

////        find name
        try{
            System.out.printf("Index %d is %s\n",findName, nameList.get(findName));
        }catch(IndexOutOfBoundsException e){
            System.out.printf("Index out of bound\n");
        }

//        is empty
        if (nameList.size() != 0){
            System.out.println("The Arraylist is not empty");
        }else{
            System.out.println("The Arraylist is empty");
        }

//        print list size
        System.out.printf("The size of the Arraylist is %d\n", nameList.size());

//        print last element
        System.out.printf("The last element of the Arraylist is %s\n", nameList.get(nameList.size()-1));
    }
}

