package guru.springframework;

/**
 * Created by Rami SAHRAOUI on 13/11/2023
 */
public interface Expression {
    Money reduce(String toCurrency);
}
