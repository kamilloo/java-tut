import org.java.tut.StarsTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class StartTreeTest {

    @Test
    public void testDraw_numberOfLevelEqualsParam(){
        Integer expectedLevel = 3;

        String[] tree = StarsTree.draw(expectedLevel);

        Assertions.assertEquals(expectedLevel, tree.length);
    }

    @Test
    public void testDraw_ExpectMinStarsOnLowerLevel(){
        Integer level = 5;

        String[] tree = StarsTree.draw(level);

        Assertions.assertEquals("    *    ", tree[0]);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,15})
    public void testDraw_ExpectMaxStarsOnHigherLevel(int level){

        String[] tree = StarsTree.draw(level);

        String highestLevel = tree[level -1];
        String expectedStars = "";
        for (int i =1;i< 2*level;i++){
            expectedStars +="*";
        }
        Assertions.assertEquals(expectedStars, highestLevel);
    }
}
