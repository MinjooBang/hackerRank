package hackerRank.beautifulQuadruples;

import java.lang.reflect.Array;
import java.util.*;

public class BeautifulQuadruples {
    static int [] arr = new int[4];
    static ArrayList alist = new ArrayList<>();
    static String addString  = "";
    static String s1="";
    static String s2="";
    static String s3="";
    static String s4="";

    public int makeOutput(int i, int i1, int i2, int i3) {

        for( int a =1 ; a <= i ; a++ ){
            for(int b = 1 ; b <= i1 ; b++ ){
                for( int c = 1 ; c <= i2 ; c++ ){
                    for ( int d = 1 ; d <= i3 ; d++ ){

                        if ( (a ^ b ^ c ^ d) != 0 ){
                            arr[0] = a;
                            arr[1] = b;
                            arr[2] = c;
                            arr[3] = d;
                            Arrays.sort(arr);

                            addString = String.valueOf(arr[0])+String.valueOf(arr[1])
                                    +String.valueOf(arr[2])+String.valueOf(arr[3]);
                            alist.add(addString);
                        }

                    }
                }
            }
        }
        List<Arrays> list = new ArrayList<Arrays>(new HashSet<Arrays>(alist));
        return list.size();
    }
}
