package Arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeProductTest {
    @Test
    public void calculatePrimeProduct(){
        int number = 10;
        int result = 10;
        int expectedResult = PrimeProduct.calculatePrimeProduct(number);
        assertEquals(expectedResult, result);

    }
}
