package level3;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void purchase(String shoeModel, double price, PaymentMethod paymentMethod) {
        System.out.println("ShoeStore: Starting purchase for " + shoeModel + " at " + price + " €");
        boolean success = paymentGateway.process(paymentMethod, price);
        if (success) {
            System.out.println("ShoeStore: Payment successful. Purchase completed!");
        } else {
            System.out.println("ShoeStore: Payment failed. Please try again.");
        }
    }
}
