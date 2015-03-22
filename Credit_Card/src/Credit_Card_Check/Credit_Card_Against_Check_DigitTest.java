//Hamza Lemsaddek
package Credit_Card_Check;

import static org.junit.Assert.*;

import org.junit.Test;

public class Credit_Card_Against_Check_DigitTest {

	@Test
	public void test() {
		assertTrue("The card number is Valid",Credit_Card_Against_Check_Digit.Luhn_test("4388576018410707"));
		assertFalse("The card number is not Valid",Credit_Card_Against_Check_Digit.Luhn_test("4246345689049834"));
	}

}
