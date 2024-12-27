import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orders;

    public OrderList(){
        orders = new ArrayList<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }

    public int getTotalCost(){
        int sum = 0;
        for(Order order:orders){
            sum += order.getOrderCost();
        }
        return sum;
    }

    public int getTotalRevenue(){
        int sum = 0;
        for(Order order:orders){
            sum += order.getOrderRevenue();
        }
        return sum;
    }
}
