package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsInStringsTest {
    @Test

    public void countDigits(){
        String [] strings = {"123ABS", "456KJU", "789OUY"};
        int totalDigits = 9;
        int result = CountDigitsInStrings.countDigitsStrings(strings);
        assertEquals(totalDigits, result );


    }

}

