package level2;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Subject {
    private final List<StockObserver> observers = new ArrayList<>();
    private String stockMarketStatus;

    @Override
    public void registerObserver(StockObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(StockObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockMarketStatus);
        }
    }

    public void changeStockMarketStatus(String newStatus) {
        if (newStatus != null && !newStatus.equals(stockMarketStatus)) {
            this.stockMarketStatus = newStatus;
            notifyObservers();
        }
    }
}
