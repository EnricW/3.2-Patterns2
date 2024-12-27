package level3;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        PaymentMethod bankDebitPayment = new BankDebitPayment("1234567890");
        PaymentMethod payPalPayment = new PayPalPayment("user@example.com");
        PaymentMethod creditCardPayment = new CreditCardPayment("1234 5678 9012 3456");

        ShoeStore shoeStore = new ShoeStore(paymentGateway);
        shoeStore.purchase("Sneakers", 50.0, bankDebitPayment);
        shoeStore.purchase("High heels", 100.0, payPalPayment);
        shoeStore.purchase("Boots", 80.0, creditCardPayment);
    }
}
