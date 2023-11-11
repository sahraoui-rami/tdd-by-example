package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public abstract class Money {
    protected int amount;

    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int multiplier);

    public  String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && this.getClass().equals(obj.getClass());
    }
}
