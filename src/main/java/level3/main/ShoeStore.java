package level3.main;

import level3.payment.PaymentGateway;
import level3.payment.PaymentCallback;

public class ShoeStore {
    private PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void purchase(String shoeModel, double price, PaymentCallback paymentCallback) {
        System.out.println("ShoeStore: Starting purchase for " + shoeModel + " at " + price + " €");
        boolean success = paymentGateway.process(paymentCallback, price);
        if (success) {
            System.out.println("ShoeStore: Payment successful. Purchase completed!");
        } else {
            System.out.println("ShoeStore: Payment failed. Please try again.");
        }
    }
}
