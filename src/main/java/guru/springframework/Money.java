package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
