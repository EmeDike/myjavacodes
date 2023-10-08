import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {
    @Test
    public void canRemoveDuplicates(){
        int[]numbers = {4, 9, 4, 4, 7, 9, 1, 7};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int uniquesValuesArray = removeDuplicates.remove(numbers);
      //  assertEquals(4, uniqueValuesArray[0]);
       // assertEquals(4, uniqueValuesArray[1]);
       // assertEquals(4, uniqueValuesArray.length);
    }

}