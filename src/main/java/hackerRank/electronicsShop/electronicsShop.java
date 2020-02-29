package hackerRank.electronicsShop;

public class electronicsShop {

    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= b) {
                    if (result < keyboards[i] + drives[j]) {
                        result = keyboards[i] + drives[j];
                    }
                }
            }
        }


        return (result == 0) ? -1 : result;
    }
}
