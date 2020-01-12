import hackerRank.dayOfProgrammerSovle;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class dayOfProgrammerTest {

    private dayOfProgrammerSovle sovle =  new dayOfProgrammerSovle();

    @Test
    public  void solveTest(){
        String input = sovle.dayOfProgrammer(2016);
        assertThat(input, is("12.09.2016"));

    }

    @Test
    public  void solve2017(){
        String input = sovle.dayOfProgrammer(2017);
        assertThat(input, is("13.09.2017"));

    }
    @Test
    public  void solve1917(){
        String input = sovle.dayOfProgrammer(1917);
        assertThat(input, is("13.09.1917"));

    }
    @Test
    public  void solve1800(){
        String input = sovle.dayOfProgrammer(1800);
        assertThat(input, is("12.09.1800"));

    }
}
