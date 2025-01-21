package level3.payment;

public class CreditCardPayment implements PaymentCallback {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment for: " + amount + " €");
        return true;
    }
}
