import hackerRank.hackerRank;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class hrTest {

    hackerRank hr = new hackerRank();


     @Test
    public void gradeStudentTest(){
         List<Integer> input = new ArrayList<>();
         input.add(73);
         input.add(67);
         input.add(38);
         input.add(33);
         List<Integer> result = hr.gradeStudents(input);
         List<Integer> expects = new ArrayList<>();
         expects.add(75);
         expects.add(67);
         expects.add(40);
         expects.add(33);
         assertThat(result.toArray(), is(expects.toArray()));

     }

}
