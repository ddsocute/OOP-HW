public class Fruit {
    private String name;
    private int cost;
    private int price;

    public Fruit(String name, int cost, int price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getPrice(){
        return price;
    }
}
