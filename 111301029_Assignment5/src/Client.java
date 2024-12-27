public class Client {
    public static void main(String[] args) {
    // IMStudent Constructor: (String name, int mis, int oop, int accounting, int economics)
    // define a variable imStd1 which type is MISStudent and store an instance of IMStudent
    // your code here...
    IMStudent imStd1 =new IMStudent("Ivy", 85, 90, 96, 98);
    // ITStudent Constructor: (String name, int mis, int oop, int ds, int db)
    // define a variable itStd1 which type is MISStudent and store an instance of ITStudent
    // your code here...
    ITStudent itStd1 = new ITStudent("Kevin", 90, 99, 83, 97);
    System.out.printf("%s's grade: %.2f\n", imStd1.getName(), imStd1.getGrade());
    System.out.printf("%s's grade: %.2f\n", itStd1.getName(), itStd1.getGrade());
    }
    }