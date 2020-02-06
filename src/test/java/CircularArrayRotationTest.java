import hackerRank.circularArrayRotation.CircularArrayRotaionIndex;
import hackerRank.circularArrayRotation.CircularArray;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @url : https://www.hackerrank.com/challenges/circular-array-rotation/problem

 */
public class CircularArrayRotationTest {

    private CircularArray solve ;

    @Before
    public void init(){
       solve = new CircularArrayRotaionIndex();
    }

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
