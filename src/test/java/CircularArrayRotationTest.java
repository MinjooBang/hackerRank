import hackerRank.CircularArrayRotation;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircularArrayRotationTest {

    private CircularArrayRotation solve = new CircularArrayRotation();

   /* @Before
    private void init(){

    }*/

    /**
     * 3 2 3
     * 1 2 3
     * 0
     * 1
     * 2
     */
    @Test
    public void testCase(){

        int [] inputArray = {1,2,3};
        int k = 2 ;
        int [] queries = {0,1,2};

        int [] expected = {2,3,1};

        int [] result = solve.circularArrayRotation(inputArray,k,queries);

        assertThat(result, is(expected));

    }

}
