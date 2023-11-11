package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Rami SAHRAOUI on 05/11/2023
 */
public class MoneyTest {
    @Test
    void testDollarMultiplication() {
        Money five = Money.dollar(5);
        Money product = five.times(2);
        assertEquals(Money.dollar(10), product);
        product = five.times(3);
        assertEquals(Money.dollar(15), product);
    }

    @Test
    void testDollarEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }
    @Test
    void testFrancMultiplication() {
        Money five = Money.franc(5);
        Money product = five.times(2);
        assertEquals(Money.franc(10), product);
        product = five.times(3);
        assertEquals(Money.franc(15), product);
    }

    @Test
    void testFrancEquality() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
