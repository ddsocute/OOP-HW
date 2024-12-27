
import java.util.ArrayList;

public class Lab9 {

    public static void main(String[] args) {
        Dog dogA = new Dog("Ruka", 0, "Shiba");
        Dog dogB = new Dog("Maya", 1, "Samoyed");
        Dog dogC = new Dog("Lucy", 1, "Husky");
        Bird birdA = new Bird("Kiwi", 0, false);
        Bird birdB = new Bird("Chuchu", 1, false);
        Bird birdC = new Bird("Dove", 0, true);

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(dogA);
        dogList.add(dogB);
        dogList.add(dogC);

        ArrayList<Bird> birdList = new ArrayList<>();
        birdList.add(birdA);
        birdList.add(birdB);
        birdList.add(birdC);

        System.out.println("Doggies names:");
        for (Dog dog : dogList) {
            System.out.print(dog.getName()+" ");
        }
        System.out.println("\nBirdies names:");
        for (Bird bird : birdList) {
            System.out.print(bird.getName()+" ");
        }
        System.out.println("\n\nComparison of dogA & birdA's breathe result:");
        dogA.breathe();
        birdA.breathe();
        System.out.println("\nMake all the dogs run and bark:");
        dogA.run();
        dogA.bark();
        dogB.run();
        dogB.bark();
        dogC.run();
        dogC.bark();
        System.out.println("\nMake all the bird fly:");
        birdA.fly();
        birdB.fly();
        birdC.fly();
        System.out.println("\nAll the dog breeds:");
        for (Dog dog : dogList) {
            System.out.print(dog.getBreed()+" ");
        }
        System.out.println("\nAll the unflyable birds:");
        for (Bird bird : birdList) {
            if (bird.getFlyable() == false) {
                System.out.print(bird.getName()+" ");
            }
        }
    }
}
