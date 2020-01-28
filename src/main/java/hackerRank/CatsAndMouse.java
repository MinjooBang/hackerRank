package hackerRank;

public class CatsAndMouse {

    public String catAndMouse(int x, int y, int z) {
        firstValidator(x,y,z);
       int diffDisA = Math.abs(x-z);
       int diffDisB = Math.abs(y-z);
        secondValidator(diffDisA,diffDisB);
        if (diffDisA == diffDisB) return  "Mouse C";
        return diffDisA > diffDisB? "Cat B":"Cat A";
    }

    private void secondValidator(int diffDisA, int diffDisB) {
        int maxCheck = 0;
        int minCheck = 0;
        if (diffDisA > diffDisB ){
            maxCheck =diffDisA;
            minCheck =diffDisB;
        }else{
            maxCheck =diffDisB;
            minCheck =diffDisA;
        }
        if (maxCheck > 100 || minCheck < 1)   throw new RuntimeException("space-separated  Exception!!");
    }

    private void firstValidator(int x, int y, int z) {
            if (x < 1 || x > 100) {
                throw new RuntimeException("Cat A Location Exception!!");
            }else if (y < 1 || y > 100){
                throw new RuntimeException("Cat B Location Exception!!");
            }else if (z < 1 || z > 100){
                throw new RuntimeException("Mouse C Location Exception!!");
            }


    }

}
