package N1E3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFora {

	@Test
	void test() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
				Fora.fora();
				});
	}

}
