
public class Bird extends Animal {

    private boolean flyable;

    public Bird(String name, int gender, Boolean flyable){
        super(name, gender);
        this.flyable = flyable;
    }

    public boolean getFlyable(){
        return this.flyable;
    }

    public void fly(){
        if(flyable){
            System.out.printf("%s is flying~\n", getName());
        }else{
            System.out.printf("%s can't fly QQ\n", getName());
        }
    }

    public void breathe(){
        System.out.printf("Birdie %s is breathing\n", getName());
    }
}
