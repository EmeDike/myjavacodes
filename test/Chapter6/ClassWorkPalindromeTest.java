package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassWorkPalindromeTest {
    @Test

    public void sumNumbers(){
        ClassWorkPalindrome  classWorkPalindrome = new ClassWorkPalindrome();
        int result = classWorkPalindrome.sum(123);
        assertEquals(6, result);
    }
    @Test
    public void sumOfAnyNumber(){
        ClassWorkPalindrome  classWorkPalindrome = new ClassWorkPalindrome();
        int sum = classWorkPalindrome.sumOfAnyDigits(11111);
        assertEquals(5, sum);

    }

    }