package N1E2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculDNI {
	
	@Test
	void test() {
		assertEquals('L', CalculDNI.calculDNI(47598404));
		assertEquals('Z', CalculDNI.calculDNI(12345678));
		assertEquals('M', CalculDNI.calculDNI(98765432));
		assertEquals('C', CalculDNI.calculDNI(78945611));
		assertEquals('B', CalculDNI.calculDNI(65498721));
		assertEquals('K', CalculDNI.calculDNI(78912354));   
		assertEquals('Z', CalculDNI.calculDNI(49758214));
		assertEquals('C', CalculDNI.calculDNI(84756124));
		assertEquals('L', CalculDNI.calculDNI(65983247));
		assertEquals('F', CalculDNI.calculDNI(78524698));
		assertEquals('Q', CalculDNI.calculDNI(39854531));
		
	}

}
