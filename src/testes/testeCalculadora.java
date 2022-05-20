package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import principal.Calculadora;

public class testeCalculadora{

	@Test
	public void test() {
		Calculadora calculo = new Calculadora();
		
		int resultado = calculo.soma(10, 5);
		assertEquals(15, resultado);
	}

}
