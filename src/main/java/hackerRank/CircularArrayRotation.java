package hackerRank;

public class CircularArrayRotation {

    public  int[] circularArrayRotation(int[] a, int k, int[] queries){

        int  [] result = new int[queries.length];
        int  [] temp = new int[a.length];
        int  patternNum = k % a.length;

        for(int index = 0; index < a.length ; index ++){
            int rePatternNum = index + patternNum;
          if(rePatternNum < a.length){
              temp[rePatternNum] = a[index];
          }else{
              temp[rePatternNum - a.length] = a[index];
          }
        }

        for(int index2 = 0;index2 < queries.length ; index2++){
            result[index2] = temp[queries[index2]];
        }

        return result;
    }
}
