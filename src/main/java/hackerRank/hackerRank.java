package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class hackerRank {


    public  List<Integer> gradeStudents(List<Integer> grades) {
        List<Integer> modifiedGrades = new ArrayList<>();
        for(int grade : grades){
            modifiedGrades.add(calculateGrade(grade));
        }
        return modifiedGrades;

    }

    public int calculateGrade(int originGrade){

        int multipleValue = 5 ;
        int valueCheck = originGrade % multipleValue ;
        int lessScore = 38 ;
        if(originGrade <lessScore)
            return originGrade;


        int resultValue = originGrade;
        if (valueCheck > 2){
            resultValue = originGrade + (multipleValue-valueCheck);
        }

        return resultValue;

    }


}
