package level2;

public class Main {
    public static void main(String[] args) {
        StockBroker broker = new StockBroker();

        BrokerageAgency agency1 = new BrokerageAgency("Ciber Agency");
        BrokerageAgency agency2 = new BrokerageAgency("Narium Agency");

        broker.registerObserver(agency1);
        broker.registerObserver(agency2);

        broker.changeStockMarketStatus("The stock market rose by 5%.");
        broker.changeStockMarketStatus("The stock market dropped by 3%.");

        broker.removeObserver(agency1);
        broker.changeStockMarketStatus("The stock market has stabilized.");
    }
}
