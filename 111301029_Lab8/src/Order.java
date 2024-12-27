public class Order {
    private Fruit fruit;
    private int number;

    public Order(Fruit fruit, int number){
        this.fruit = fruit;
        this.number = number;
    }

    public int getOrderCost(){
        return fruit.getCost() * number;
    }

    public int getOrderRevenue(){
        return fruit.getPrice() * number;
    }

}
