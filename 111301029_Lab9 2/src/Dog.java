
public class Dog extends Animal {

    private String breed;

    public Dog(String name, int gender, String breed) {
        super(name, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void bark() {
        System.out.printf("%s barks\n", getName());
    }

    public void run() {
        System.out.printf("%s is running\n", getName());
    }

}
