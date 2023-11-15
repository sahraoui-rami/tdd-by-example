package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 14/11/2023
 */
public class Sum implements Expression {
    private final Money augend;
    private final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String toCurrency) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, toCurrency);
    }

    public Money getAugend() {
        return augend;
    }

    public Money getAddend() {
        return addend;
    }
}
