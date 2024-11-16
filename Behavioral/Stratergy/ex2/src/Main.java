public class Main {
    public static void main(String[] args) {
        double amountToPay = 100.0; // Amount in dollars

        // User selects Credit Card Payment
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.executePayment(amountToPay);

        // User switches to PayPal Payment
        paymentContext.setStrategy(new PayPalPayment());
        paymentContext.executePayment(amountToPay);

        // User switches to Google Pay Payment
        paymentContext.setStrategy(new GooglePayPayment());
        paymentContext.executePayment(amountToPay);
    }
}