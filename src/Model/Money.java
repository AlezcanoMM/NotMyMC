package Model;



public class Money {
    private final double ammount;
    private final Currency currency;

    public Money(double ammount, Currency currency) {
        this.ammount = ammount;
        this.currency = currency;
    }

    public double getAmmount() {
        return ammount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
