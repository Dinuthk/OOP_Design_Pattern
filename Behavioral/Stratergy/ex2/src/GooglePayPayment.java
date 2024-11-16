public class GooglePayPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing Google payment of $" + amount);
    }
}
