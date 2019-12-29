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
         List<Integer> result = hr.gradeStudent(input);
         List<Integer> Expect = new ArrayList<>();
         Expect.add(75);
         Expect.add(67);
         Expect.add(40);
         Expect.add(33);

         assertThat(result.toArray(), is(Expect.toArray()));
     }//gradeStudentTest

}//hrTest
