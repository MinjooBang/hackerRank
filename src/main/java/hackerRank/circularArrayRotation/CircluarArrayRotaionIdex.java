package hackerRank.circularArrayRotation;

public class CircluarArrayRotaionIdex implements CircularArray {
    @Override
    public int[] circularArrayRotation(int[] inputArray, int cycle, int[] queries) {
        int patternNum =  cycle % inputArray.length;
        int[] result = new int[queries.length];

        for(int index = 0; index < queries.length; index++){
            int reIndex = makeIndex(queries[index], patternNum, inputArray.length);

            result[index] = inputArray[reIndex];
        }

        return result;
    }

    private int makeIndex(int arrayIndex, int patternNum, int length){

        return (arrayIndex - patternNum < 0)? arrayIndex - patternNum + length : arrayIndex - patternNum;
    }
}
