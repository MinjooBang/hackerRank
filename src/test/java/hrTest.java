import hackerRank.hackerRank;
import hackerRank.kangaroo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class hrTest {




     @Test
    public void gradeStudentTest(){
         hackerRank hr = new hackerRank();
         List<Integer> input = new ArrayList<>();
         input.add(73);
         input.add(67);
         input.add(38);
         input.add(33);
         List<Integer> expects = new ArrayList<>();
         expects.add(75);
         expects.add(67);
         expects.add(40);
         expects.add(33);
         List<Integer> result = hr.gradeStudents(input);

         assertThat(result.toArray(), is(expects.toArray()));

     }

    @Test
     public void kangarooLoctionTest(){
        kangaroo kr = new kangaroo();
         String result1 = kr.kangarooLoctaion(0,3,4,2);
        String expects1 ="YES";
        assertThat(result1, is(expects1));

        String result2 = kr.kangarooLoctaion(0,2,5,3);
        String expects2 ="NO";
        assertThat(result2, is(expects2));
     }

}
