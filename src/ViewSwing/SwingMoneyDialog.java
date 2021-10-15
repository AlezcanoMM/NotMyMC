package ViewSwing;

import Model.Currency;
import Model.Money;
import View.MoneyDialog;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingMoneyDialog extends JPanel implements MoneyDialog{
    
    private final List <Currency> currencies;
    private Double amount;
    private Currency from;
    private Currency to;

    public SwingMoneyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.add(amount());
        this.add(currencyFrom());
        this.add(currencyTo());
    }
    

    @Override
    public Money getMoneyFrom() {
        return new Money(amount,from);
    }

    @Override
    public Currency getCurrencyto() {
        return to;
    }

    private Component currencyTo() {

        JComboBox combo = new JComboBox();
        //TODO
        combo.addItemListener(currencyToChanged());

        return combo;
    }


        

    private Component currencyFrom() {
        JComboBox combo = new JComboBox(nameOf(currencies));
        combo.addItemListener(currencyFromChanged());
        return combo;
    }

    private Component amount() {
        JTextField textField = new JTextField("");
        //TODO
        textField.addActionListener(amountChanged());
        return textField;
    }
        

    private Object[] nameOf(List<Currency> currencies) {
        ArrayList<String> names = new ArrayList<>();
        for (Currency currency : currencies) {
            names.add(currency.getName());
        }
        return names.toArray();
    }

    private ActionListener amountChanged() {
        
    }

    private ItemListener currencyFromChanged() {
        return new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                from = currencies.get(comboBox.getSelectedIndex());
            }
        };
    }

    private ItemListener currencyToChanged() {
        return new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                to = currencies.get(comboBox.getSelectedIndex());
            }
        };
    }
    
}
