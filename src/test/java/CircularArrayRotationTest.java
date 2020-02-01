import hackerRank.circularArrayRotation.CircularArray;
import hackerRank.circularArrayRotation.CircularArrayRotation;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @url : https://www.hackerrank.com/challenges/circular-array-rotation/problem
 * 입력받은 순환 수 만큼 배열을 재배열
 * 입력받은 요소값의 재배열의 값을 출력
 * Constraints
 *  1 <= n <= 10^5
 *  1 <= a[i] <= 10^5
 *  1 <= k <= 10^5
 *  1 <= q <= 500
 *  0 <= m < n
 */
public class CircularArrayRotationTest {

   public CircularArray solve ;

   @Before
   public void init(){
       solve = new CircularArrayRotation();
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
