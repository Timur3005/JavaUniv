package third.formatter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    protected double convert(double amount) {
        return amount * exchangeRate;
    }

    protected String formatCurrency(double amount, String currencyCode) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        currencyFormatter.setCurrency(java.util.Currency.getInstance(currencyCode));

        return currencyFormatter.format(amount);
    }
}
