package level2;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Subject {
    private final List<StockObserver> observers = new ArrayList<>();
    private String stockMarketStatus;

    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockMarketStatus);
        }
    }

    public void changeStockMarketStatus(String newStatus) {
        this.stockMarketStatus = newStatus;
        notifyObservers();
    }
}
