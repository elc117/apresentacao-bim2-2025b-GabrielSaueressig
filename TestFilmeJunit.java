import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFilmeJunit{
        Filme novoFilme;
        @BeforeEach
        public void setUp() {

        novoFilme = new Filme();
        novoFilme.setNome("Como Treinar o Seu Dragão");
        novoFilme.setDuracaoMinutos(125);
        novoFilme.setNota(2);
        novoFilme.setAtor("Nico Parker");
        novoFilme.setFilmeLancado(true);

        }

        @Test
        public void testarNome() {
            assertEquals("Como Treinar o Seu Dragão", novoFilme.getNome());
        }

        @Test
        public void testarDuracaoMinutos() {
            assertEquals(125, novoFilme.getDuracaoMinutos());
        }

        @Test
        public void testarNotaMedia() {
            assertEquals(2, novoFilme.getNota());
        }
        @Test
        public void testarFilmeLancado() {
            assertTrue(novoFilme.getFilmeLancado());
        }
    }
