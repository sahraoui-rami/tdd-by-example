package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 13/11/2023
 */
public interface Expression {
    Money reduce(Bank bank, String toCurrency);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
