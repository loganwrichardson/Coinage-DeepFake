import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class USDHalfDollarTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDHalfDollarTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
	@Test
		public void testConstructor() {
			try {
				Coin testUSDHalfDollar = new USDHalfDollar(0.5,"USD",new CompHQD());
				assertNotNull(testUSDHalfDollar);
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
			Coin testUSDHalfDollar = new USDHalfDollar(0.5,"USD",new CompHQD());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Beginning smelting:\n91.67% Cu\n8.33% Ni\n"; 
			String testOutput = null;
			testUSDHalfDollar.smelt();
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
			Coin testUSDHalfDollar = new USDHalfDollar(0.5,"USD",new CompHQD());
			PrintStream origOut = System.out;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream newOut = new PrintStream(baos);
			System.setOut(newOut);
			String expectedResult = "Minting a USD HalfDollar!\n"; 
			String testOutput = null;
			testUSDHalfDollar.display();
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
			Coin testUSDHalfDollar = new USDHalfDollar(0.5,"USD",new CompHQD());
			Double expectedResult = 0.5;
			Double testOutput = testUSDHalfDollar.getDenomination();
			assertEquals(expectedResult, testOutput,
					"Expected:'" + expectedResult 
					+ "' but got '" + testOutput + "'.");
		}
}
