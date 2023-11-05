package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && this.getClass().equals(obj.getClass());
    }
}
