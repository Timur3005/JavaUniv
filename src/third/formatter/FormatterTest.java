package third.formatter;

import java.util.Scanner;

public class FormatterTest {

    //1 task
    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter(1.15);

        double amountInUSD = 100.0;
        double amountInEUR = converter.convert(amountInUSD);

        System.out.println("Сумма в USD: " + converter.formatCurrency(amountInUSD, "USD"));
        System.out.println("Сумма в EUR: " + converter.formatCurrency(amountInEUR, "EUR"));
    }

}
