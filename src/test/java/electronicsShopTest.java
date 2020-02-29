import hackerRank.electronicsShop.electronicsShop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class electronicsShopTest {
    private electronicsShop solve = new electronicsShop();

    @Test
    public void testOne() {
        int [] keybordIn = {3 ,1};
        int [] usbIn = {5 ,2, 8};
        int budget = 10;
        int expected = 9;
        int result = solve.getMoneySpent(keybordIn,usbIn,budget);
        assertThat(result, is(expected));
    }
}
