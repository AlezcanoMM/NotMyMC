package Control;

import Model.ExchangeRate;
import Model.Money;
import Persistence.ExchangeRateLoader;
import View.MoneyDialog;
import View.MoneyDisplay;

public class CalculateCommand implements Command{

    private MoneyDialog moneyDialog;
    private MoneyDisplay moneyDisplay;
    private ExchangeRateLoader exchangerateloader;

    public CalculateCommand(MoneyDialog moneyDialog, MoneyDisplay moneyDisplay, ExchangeRateLoader exchangerateloader) {
        this.moneyDialog = moneyDialog;
        this.moneyDisplay = moneyDisplay;
        this.exchangerateloader = exchangerateloader;
    }
    
    
    
    @Override
    public String getName() {
        return "Calculate";
    }

    @Override
    public void execute() {
        Money moneyFrom = moneyDialog.getMoneyFrom();
        ExchangeRate exchangeRate = exchangeRateLoader.get(moneyFrom.getCurrency(), moneyDialog.getCurrencyto());
        double amountTo = moneyFrom.getAmmount() * exchangeRate.getRate();
        moneyDisplay.display(new Money(amountTo, moneyDialog.getCurrencyto()));
                
    }
 
}

  