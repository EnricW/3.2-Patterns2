package level2.observer;

import level2.exceptions.InvalidStockMarketStatusException;
import level2.exceptions.NullObserverException;
import level2.exceptions.ObserverAlreadyRegisteredException;
import level2.exceptions.ObserverUpdateException;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Subject {
    private final List<StockObserver> observers = new ArrayList<>();
    private String stockMarketStatus;

    @Override
    public void registerObserver(StockObserver observer) {
        if (observer == null) {
            throw new NullObserverException("Observer cannot be null");
        }
        if (observers.contains(observer)) {
            throw new ObserverAlreadyRegisteredException("Observer is already registered: " + observer);
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        if (observer == null) {
            throw new NullObserverException("Observer cannot be null");
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (stockMarketStatus == null || stockMarketStatus.isEmpty()) {
            throw new InvalidStockMarketStatusException("Stock market status is invalid or empty");
        }

        for (StockObserver observer : observers) {
            if (observer == null) {
                throw new NullObserverException("A null observer found in the list.");
            }

            try {
                observer.update(stockMarketStatus);
            } catch (Exception e) {
                throw new ObserverUpdateException("Error notifying observer: " + observer, e);
            }
        }
    }

    public void changeStockMarketStatus(String newStatus) {
        if (newStatus == null || newStatus.isEmpty()) {
            throw new InvalidStockMarketStatusException("Stock market status cannot be null or empty");
        }
        if (!newStatus.equals(stockMarketStatus)) {
            this.stockMarketStatus = newStatus;
            notifyObservers();
        }
    }
}
