package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class hackerRank {


    public List<Integer> gradeStudent(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        int score = 0 ;
        for (int i = 0; i<grades.size();i++){

            if (grades.get(i) >= 38){
                int a = (grades.get(i)/5) +1 ;
                int check = (a*5) - grades.get(i);
                if (check < 3){
                    score = (a*5) ;
                }else{
                    score = grades.get(i);
                }
            }else{
                score = grades.get(i);
            }

            result.add(score);
        }

        return result;

    }
}
