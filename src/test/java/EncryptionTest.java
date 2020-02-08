import hackerRank.Encryption.Encryption;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EncryptionTest {

    private Encryption solve;

    @Before
    public void init(){
        solve = new Encryption();
    }


    @Test
    public void testOne(){
        String input = "haveaniceday";
        String expected = "hae and via ecy ";
        String result = solve.makeEncryption(input);

        assertThat(result, is(expected));
    }
}
