package N1E2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DNITest {

	@ParameterizedTest
	@CsvSource({ 
        "47598404, L",
        "39854531, Q",
        "87654321, X",
        "65432187, Q",
        "17384755, K",
        "93763847, E",
        "89465342, S",
        "98347836, P",
        "82936162, X",
        "64576676, D"
})
	void test(int dni, char lletra) {
		assertEquals(lletra, CalculDNI.calculDNI(dni));
	}

}
