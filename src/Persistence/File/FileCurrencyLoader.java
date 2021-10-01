package Persistence.File;

import Model.Currency;
import Persistence.CurrencyLoader;

import java.util.ArrayList;

public class FileCurrencyLoader implements CurrencyLoader {
    private  final String fileName;

    public FileCurrencyLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<Currency> loadAllCurrencies(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}