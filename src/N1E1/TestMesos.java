package N1E1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMesos {

	private final Mesos mesos = new Mesos();
	@Test
	void test() {
		assertEquals(12, mesos.getMesos().size());
		assertNotNull(mesos);
		assertEquals("Agost", mesos.getMesos().get(7));//es la posicio 7 peor es la vuitena
		
	}

}
