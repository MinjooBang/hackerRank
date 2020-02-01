package hackerRank.circularArrayRotation;


public class CircularArrayRotation implements CircularArray {


    public  int[] circularArrayRotation(int[] inputArray, int cycle, int[] queries){

        return resultArray(queries, CirculateArray(inputArray, cycle));
    }


    private int[] CirculateArray(int[] inputArray, int cycle) {
        int  [] reArrange  = new int[inputArray.length];
        int  patternNum = cycle % inputArray.length;

        for(int index = 0; index < inputArray.length ; index ++){
            int rePatternNum = index + patternNum;
            int reIndex = (rePatternNum < inputArray.length ? rePatternNum : rePatternNum - inputArray.length);

            reArrange[reIndex] = inputArray[index];
        }
        return reArrange;
    }

    private int[] resultArray(int[] queries, int[] reArrange) {

        int [] result = new int[queries.length];

        for(int index = 0; index < queries.length ; index++){
            result[index] = reArrange[queries[index]];
        }

        return result;
    }


}
