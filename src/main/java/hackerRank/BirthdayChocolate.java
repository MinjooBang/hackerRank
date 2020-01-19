package hackerRank;

import java.util.List;

public class BirthdayChocolate {

    public int solve(List<Integer> chocolate, int day, int month) {
        int result = 0;

        for(int index = 0;index < chocolate.size();index++){

           if (chocolate.size() >= index+month) {
               if (calculateDays(chocolate.subList(index, index + month) ,day)) result++ ;
            }
         }

        return result;
    }

    private boolean calculateDays(List<Integer> chocolates, int day){
        int sum = 0;
        for(int index =0 ; index<chocolates.size();index++){
            sum += chocolates.get(index);
        }
        return sum == day ? true:false;
    }


}
