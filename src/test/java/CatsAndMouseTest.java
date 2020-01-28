import hackerRank.CatsAndMouse;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CatsAndMouseTest {

    private CatsAndMouse solve = new CatsAndMouse();

    @Test
    public  void solveOne(){
    //1 2 3
       String result = solve.catAndMouse(1,2,3);
        assertThat(result, is("Cat B"));

    }
    //100 11 55
    @Test
    public  void solveTwo(){
        //1 2 3
        String result = solve.catAndMouse(100,11,55);
        assertThat(result, is("Cat B"));

    }
    //21 95 58
    @Test
    public  void solveThree(){
        //21 95 58
        String result = solve.catAndMouse(21,95,58);
        assertThat(result, is("Mouse C"));

    }
    @Test(expected = RuntimeException.class)
    public void validatorException() {
        solve.catAndMouse(15,12,15);
    }
}
