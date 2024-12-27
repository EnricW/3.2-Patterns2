package level2;

public class BrokerageAgency implements StockObserver {
    private final String name;

    public BrokerageAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received the following message: " + message);
    }
}
