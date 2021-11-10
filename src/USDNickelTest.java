import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class USDQuarterTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDNickelTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
	@Test
        public void testConstructor() {
            try {
                Coin testUSDNickel = new USDNickel(0.05,"USD",new CompNFFTF());
                assertNotNull(testUSDNickel);
            }
            catch (Exception e) {
                fail("Constructor threw exception: " + e.getMessage());
            }
        }
	/*
	 * Function to run smelting test
	 * @return void
	 */
    @Test
        public void testSmelt() {
            Coin testUSDNickel = new USDNickel(0.05,"USD",new CompNFFTF());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\n75% Cu\n25% Ni\n";; 
            String testOutput = null;
            testUSDNickel.smelt();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * Function to run minting test
	 * @return void
	 */
    @Test
        public void display() {
            Coin testUSDNickel = new USDNickel(0.05,"USD",new CompNFFTF());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Minting a USD Nickel!\n"; 
            String testOutput = null;
            testUSDNickel.display();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * Function to run test on coin denomination
	 * @return void
	 */
    @Test
        public void testgetDenomination() {
            Coin testUSDNickel = new USDNickel(0.05,"USD",new CompNFFTF());
            Double expectedResult = 0.05;
            Double testOutput = testUSDNickel.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
}
