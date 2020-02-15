import hackerRank.beautifulQuadruples.BeautifulQuadruples;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BeautifulQuadruplesTest {

    private BeautifulQuadruples solve = new BeautifulQuadruples();

    @Test
    public void testOne(){
        int expected = 11;
        int result = solve.makeOutput(1,2,3,4);
        assertThat(result, is(expected));
    }

}
