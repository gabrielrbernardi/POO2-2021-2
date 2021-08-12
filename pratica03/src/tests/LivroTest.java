package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import controller.Livros;

public class LivroTest {

	@Test
	void test() {
		Livros L = new Livros("Titulo 1", "Gabriel", 2000);
		assertTrue(L.getTitulo() == "Titulo 1");
		assertTrue(L.getAutor() == "Gabriel");
		assertTrue(L.getAno() == 2000);
	}
}
