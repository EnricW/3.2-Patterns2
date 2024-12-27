package level3;

public class PaymentGateway {
    public boolean process(PaymentMethod paymentMethod, double amount) {
        System.out.println("Payment Gateway: Redirecting to payment method...");
        return paymentMethod.processPayment(amount);
    }
}
