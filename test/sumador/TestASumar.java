package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestASumar {
	static ASumar sumar;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sumar = new ASumar();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		sumar = null;
	}

	@Test
    public void testUnaCifra() {
        String sumatorio = sumar.sumativo("5");
        assertEquals("5 = 5",sumatorio);
    }

}
