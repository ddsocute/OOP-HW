
public class Animal {

    private String name;
    private int gender;

    public Animal(String name, int gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getGender() {
        return this.gender;
    }

    public void breathe() {
        System.out.printf("%s is breathing.\n", this.name);
    }
}
