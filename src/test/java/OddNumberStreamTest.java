import org.java.tut.OddNumberStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class OddNumberStreamTest {

    @Test
    public void testOddNumberStream(){
        List<Integer> expected = Stream.of(1,3,5,7,9)
                .collect(Collectors.toList());

        List<Integer> actual = OddNumberStream.oddNumberStream(1,10)
                .stream().collect(Collectors.toList());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testeventNumberSkipByStream(){
        Integer skipped = 2;

        List<Integer> actual = OddNumberStream.oddNumberStream(1,5).stream().collect(Collectors.toList());

        Assertions.assertAll("sequence", () -> assertThat(actual, not(contains(skipped))));

    }
}
