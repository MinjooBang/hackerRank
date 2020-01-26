package hackerRank;

public class CatsAndMouse {

    public String catAndMouse(int x, int y, int z) {
       int diffDisA = Math.abs(x-z);
       int diffDisB = Math.abs(y-z);
        if (diffDisA == diffDisB) return  "Mouse C";
        return diffDisA > diffDisB? "Cat B":"Cat A";
    }

}
