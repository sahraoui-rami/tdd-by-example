package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
