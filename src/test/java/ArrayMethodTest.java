import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;

public class ArrayMethodTest {

    @Test
    public void getSmallestAmountOfArray(){
        int[] intArray = new int[]{ 5, 3, 7};

        int min = IntStream.of(intArray).min().getAsInt();
        Assertions.assertEquals(3,  min);
    }

    @Test
    public void getMissingAmountOfArray(){
        int[] intArray = new int[]{ 5, 3, 7};

        OptionalInt min = IntStream.of(intArray).filter(value -> value == 4).findFirst();
        Assertions.assertTrue(min.isEmpty());
    }

    @Test
    public void getExisitngAmountOfArray(){
        int[] intArray = new int[]{ 5, 3, 7};

        OptionalInt min = IntStream.of(intArray).filter(value -> value == 7).findFirst();
        Assertions.assertTrue(min.isPresent());
    }


    @Test
    public void getSumAmountOfArray(){
        int[] intArray = new int[]{ 5, 3, 7};

        int min = IntStream.of(intArray).sum();
        Assertions.assertEquals(15, min);
    }
}
