package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
