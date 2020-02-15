package hackerRank.beautifulQuadruples;

public class BeautifulQuadruples {

    public int makeOutput(int i, int i1, int i2, int i3) {
        int miusNum = 0;
        int allNum = 0;
        for (int c = 0; c <i ; c++) {
            for (int idx = 0; idx < i1; idx++) {
                allNum += i3 * i2;
                for (int idx2 = 1; idx2 <= i2; idx2++) {
                    miusNum += idx2;
                }
                i2--;
            }
        }
        return allNum - miusNum;
    }

    public int makeOutput2(int i, int i1, int i2, int i3) {
        int sum =0;
        int minus = 0;
        for( int a =0 ; a < i ; a++ ){
            for(int b = 0 ; b < i1 ; b++ ){
                for( int c = 0 ; c < i2 ; c++ ){
                    for ( int d = 0 ; d < i3 ; d++ ){
                        if ( (a ^ b ^ c ^ d) != 0 ){
                            sum++;
                        }

                    }
                }
            }
        }
        return sum - minus  ;
    }
}
