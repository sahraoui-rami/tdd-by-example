package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
