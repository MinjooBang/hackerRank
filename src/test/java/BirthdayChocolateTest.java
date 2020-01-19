
import hackerRank.BirthdayChocolate;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BirthdayChocolateTest {
    private BirthdayChocolate chocolate  = new BirthdayChocolate();
    @Test
    public  void solveTestOne(){
        List<Integer> input = Arrays.asList(1,2,1,3,2);
        int expected = 2;
        int result = chocolate.solve(input,3,2);
        assertThat(result, is(expected));


    }
    @Test
    public  void solveTestTwo(){
        List<Integer> input = Arrays.asList(4);
        int expected = 1;
        int result = chocolate.solve(input,4,1);
        assertThat(result, is(expected));


    }


    @Test
    public  void solveTestThree(){
        List<Integer> input = Arrays.asList(1 ,1 ,1, 1, 1, 1);
        int expected = 0;
        int result = chocolate.solve(input,3,2);
        assertThat(result, is(expected));


    }



}
