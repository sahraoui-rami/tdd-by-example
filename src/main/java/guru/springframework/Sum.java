package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 14/11/2023
 */
public class Sum implements Expression {
    private final Expression augend;
    private final Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String toCurrency) {
        int amount = augend.reduce(bank, toCurrency).amount
                + addend.reduce(bank, toCurrency).amount;
        return new Money(amount, toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }

    public Expression getAugend() {
        return augend;
    }

    public Expression getAddend() {
        return addend;
    }
}
