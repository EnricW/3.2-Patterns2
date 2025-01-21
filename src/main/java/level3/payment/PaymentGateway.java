package level3.payment;

public class PaymentGateway {
    public boolean process(PaymentCallback paymentCallback, double amount) {
        System.out.println("Payment Gateway: Redirecting to payment method...");
        return paymentCallback.processPayment(amount);
    }
}
