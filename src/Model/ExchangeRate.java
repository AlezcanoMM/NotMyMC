package Model;



public class ExchangeRate {
    private double rate;
    private final Currency from;
    private final Currency to;

    public ExchangeRate(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }

    public double getRate() {
        return rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }
    
    
    
    
}
