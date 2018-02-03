import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataMissingLetterTest {

    @Test
    public void exampleTests() {
        assertEquals('e', KataMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', KataMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
