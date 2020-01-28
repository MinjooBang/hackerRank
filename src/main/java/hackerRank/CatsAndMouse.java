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
        if (diffDisA > 100 || diffDisA < 1 || diffDisB > 100 || diffDisB < 1)   throw new RuntimeException("space-separated  Exception!!");
    }

    private void firstValidator(int x, int y, int z) {
        if (x < 1 || x > 100 || y < 1 || y > 100 || z < 1 || z > 100)
                throw new RuntimeException("Cat A Location Exception!!");
    }

}
