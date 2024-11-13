public class Main {
    public static void main(String[] args) {
        Stock ballStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(ballStock);
        SellStock sellStockOrder = new SellStock(ballStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);

        broker.placeOrders();
    }
}