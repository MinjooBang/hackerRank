import hackerRank.beautifulQuadruples.BeautifulQuadruples;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BeautifulQuadruplesTest {

    private BeautifulQuadruples solve = new BeautifulQuadruples();

    @Test
    public void testOne(){
        int expected = 11;
        int result = solve.makeOutput2(2,1,4,3);
        assertThat(result, is(expected));
    }

    @Test
    public void delete(){
        int i =2;int i1=4;int i2 = 1;int i3 =3;
         int big1 =0;
         int big2 =0;
         int big3 =0;
         int big4 =0;
         if(i > i1 && i > i2 && i > i3){
             big1 = i;
             if( i1 > i2 && i1 > i3 ){
                 big2 = i1;
                 if(i2 > i3){
                     big3 = i2;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i2;
                 }
             }else if (i2 > i1 && i2 > i3){
                 big2 = i2;
                 if(i1 > i3){
                     big3 = i1;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i1;
                 }
             }else{
                 big2= i3;
                 if(i1 > i2){
                     big3 = i1;
                     big4 = i2;
                 }else{
                     big3 = i2;
                     big4 = i1;
                 }
             }
         }else if (i1 > i && i1 > i2 && i1 > i3){
             big1 = i1;
             if( i > i2 && i > i3 ){
                 big2 = i;
                 if(i2 > i3){
                     big3 = i2;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i2;
                 }
             }else if (i2 > i && i2 > i3){
                 big2 = i2;
                 if(i > i3){
                     big3 = i;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i;
                 }
             }else {
                 big2 = i3;
                 if (i > i2) {
                     big3 = i;
                     big4 = i2;
                 } else {
                     big3 = i2;
                     big4 = i;
                 }
             }
         }else if ( i2 > i && i2 > i1 && i2 > i3){
             big1 = i2;
             if( i > i1 && i > i3 ){
                 big2 = i;
                 if(i1 > i3){
                     big3 = i1;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i1;
                 }
             }else if (i1 > i && i1 > i3){
                 big2 = i1;
                 if(i > i3){
                     big3 = i;
                     big4 = i3;
                 }else{
                     big3 = i3;
                     big4 = i;
                 }
             }else {
                 big2 = i3;
                 if (i1 > i2) {
                     big3 = i1;
                     big4 = i2;
                 } else {
                     big3 = i2;
                     big4 = i1;
                 }
             }
         }else{
             big1 = i3;
             if( i > i1 && i > i2 ){
                 big2 = i;
                 if(i1 > i2){
                     big3 = i1;
                     big4 = i2;
                 }else{
                     big3 = i2;
                     big4 = i1;
                 }
             }else if (i1 > i && i1 > i2){
                 big2 = i1;
                 if(i > i2){
                     big3 = i;
                     big4 = i2;
                 }else{
                     big3 = i2;
                     big4 = i;
                 }
             }else {
                 big2 = i2;
                 if (i1 > i) {
                     big3 = i1;
                     big4 = i;
                 } else {
                     big3 = i;
                     big4 = i1;
                 }
             }
         }

        int miusNum = 0;
        int allNum = 0;
        for (int id = 0; id < big4 ; id++) {
            for (int idx = 0; idx < big3; idx++) {
                allNum += big1 * big2;
                System.out.println(allNum);
                for (int idx2 = 1; idx2 <= big2; idx2++) {
                    miusNum += idx2;
                }
                big2--;
            }
        }
        System.out.println("result"+ (allNum-miusNum));
    }
}
