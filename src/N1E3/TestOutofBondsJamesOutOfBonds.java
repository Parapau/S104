package N1E3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOutofBondsJamesOutOfBonds {

	@Test
	void test() {
		assertThrows(java.lang.ArrayIndexOutOfBoundsException, OutofBondsJamesOutOfBonds.casinoRoyale());
	}

}
