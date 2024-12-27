package level3;

public class BankDebitPayment implements PaymentMethod {
    private String accountNumber;

    public BankDebitPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing bank debit payment for: " + amount + " €");
        return true;
    }
}
