package Persistence;

public interface ExchangeRateLoader {
    
    public ExchangeRate getExchangeRate(Currency from, Currency to);
}
