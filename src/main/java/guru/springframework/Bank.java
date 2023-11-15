package guru.springframework;

import java.util.HashMap;

/**
 * Created by Rami SAHRAOUI on 13/11/2023
 */
public class Bank {
    private final HashMap<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}