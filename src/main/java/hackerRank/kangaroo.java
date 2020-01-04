package hackerRank;

public class kangaroo {

    /*
      @url :  https://www.hackerrank.com/challenges/kangaroo/problem
      kangaroo1 : start1 , distance1
      kangaroo2 : start2 , distance2
      0 <= start1 < start2 <=1000
      1 <= distance1 <= 1000
      1 <= distance2 <= 1000
    */
    public String kangarooLoctaion(int start1,int distance1,int start2,int distance2) {
        String result = "NO";

        if (start1 > start2 || distance1 == distance2 ){
            return result ;
        }

        boolean check =  calculateLocation(start1,distance1,start2,distance2);
        if (check){
            result ="YES";
        }


        return result;
    }

    public boolean calculateLocation(int start1,int distance1,int start2,int distance2){
        boolean locationCheck = false;
        int jumpCount  = (start2 - start1) / (distance1-distance2);

        if(jumpCount < 0){
            return  locationCheck;
        }

        if( start1 + (jumpCount * distance1) ==  start2 + (jumpCount *distance2)){
            locationCheck =true;
        }


        return locationCheck;
    }
}
