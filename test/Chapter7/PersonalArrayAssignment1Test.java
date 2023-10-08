package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalArrayAssignment1Test {

    @Test
    public void sumArrayIndices() {
        int[] newArray = {1, 1, 1, 0, 6, 1, 4};
        int total = 14;
        int result = PersonalArrayAssignment1.sumArrayElements(newArray);
        assertEquals(total, result);
    }

    @Test
    public void getEvenNumberPositions(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int evenNumberPositions = 16;
        int result = PersonalArrayAssignment1.evenPosition(newArray);
        assertEquals(evenNumberPositions, result);

    }

    @Test
    public void getOddNumberPositions(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int oddNumberPositions = 11;
        int result = PersonalArrayAssignment1.oddPosition(newArray);
        assertEquals(oddNumberPositions, result);
    }

    @Test
    public void addEvenNumbers(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int evenSum = 14;
        int result = PersonalArrayAssignment1.addEvenNumbers(newArray);
        assertEquals(evenSum, result);
    }

    @Test
    public void addOddNumbers(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int oddSum = 13;
        int result = PersonalArrayAssignment1.addOddNumbers(newArray);
        assertEquals(oddSum, result);
    }
    }
    //add the even numbers in the array
    // Example say you have an array = {1,2,3,4,5,6,7}
    // the even numbers here are 2,4,6 and the sum is 12
    //add the odd numbers in the array
