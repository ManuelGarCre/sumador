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
	// Probamos la introducción de una sola cifra positiva
    public void testUnaCifra() {
        String sumatorio = sumar.sumativo("5");
        assertEquals("5 = 5",sumatorio);
    }
	
	@Test
	//Probamos con numeros negativos
	public void testCifraNeg() {
		String sumatorio = sumar.sumativo("-100");
        assertEquals("Negativo, siempre negativo",sumatorio);
	}
	
	@Test
	//Probamos con numeros de más de una cifra
	public void testVariasCifras() {
		String sumatorio = sumar.sumativo("3433");
        assertEquals("3 + 4 + 3 + 3 = 13",sumatorio);
	}
}
