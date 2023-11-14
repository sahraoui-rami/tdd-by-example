package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 13/11/2023
 */
public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
