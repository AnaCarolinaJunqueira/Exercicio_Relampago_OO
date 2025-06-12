import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarNomeDiretor()
    {
        Professor diretor = new Professor();
        diretor.setNome("Joao");
        Escola escola = new Escola();
        escola.setDirecao(diretor);
        assertEquals("Joao", escola.getNomeDiretor());
    }

    @Test
    void deveRetornarEscolaSemDiretor() {
        Escola escola = new Escola();
        assertEquals("Escola sem diretor", escola.getNomeDiretor());
    }

}