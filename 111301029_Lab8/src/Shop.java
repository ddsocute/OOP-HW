public class Shop {
    private OrderList orderList;

    public Shop() {
        this.orderList = new OrderList();
    }

    public void addOrder(Fruit fruit, int number) {
        Order newOrder = new Order(fruit, number);
        orderList.addOrder(newOrder);
    }

    public String getReport() {
        int revenue = orderList.getTotalRevenue();
        int cost = orderList.getTotalCost();
        int profit = revenue - cost;
        String returnString = String.format("Total Revenue: %d\n" +
                "Total Cost: %d\n" +
                "Total Profit: %d\n"
                , revenue, cost, profit);
        return returnString;
    }
}
