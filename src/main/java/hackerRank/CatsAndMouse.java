package hackerRank;

public class CatsAndMouse {

    public String catAndMouse(int x, int y, int z) {

        firstValidator(x);
        firstValidator(y);
        firstValidator(z);

        int diffDistanceA = Math.abs(x-z);
        int diffDistanceB = Math.abs(y-z);

        secondValidator(diffDistanceA);
        secondValidator(diffDistanceB);

        if (diffDistanceA == diffDistanceB) return  "Mouse C";
        return diffDistanceA > diffDistanceB? "Cat B":"Cat A";
    }

    private void secondValidator(int queries) {
        if (queries < 1 || queries > 100 )
            throw new RuntimeException("space-separated  Exception!!");
    }

    private void firstValidator(int x) {
        if (x < 1 || x > 100 )
                throw new RuntimeException("Cat A Location Exception!!");
    }

}
