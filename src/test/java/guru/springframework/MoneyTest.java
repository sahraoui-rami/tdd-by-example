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
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);;
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testDollarEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Franc(5));
    }
    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);;
        assertEquals(new Franc(15), product);
    }

    @Test
    void testFrancEquality() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}
