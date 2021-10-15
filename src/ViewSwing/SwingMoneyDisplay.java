package ViewSwing;

import Model.Money;
import View.MoneyDisplay;
import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{

    private Money money;
    @Override
    public void display(Money money) {
        this.money = money;
        this.add(amount());
        this.add(currency());
        this.updateUI();
    }

    private Component amount() {
        return new JLabel(String.valueOf(money.getAmmount()));
    }

    private Component currency() {
        return new JLabel(money.getCurrency().getSymbol());
    }
    
}
