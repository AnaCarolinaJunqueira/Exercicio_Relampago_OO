import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomeTipoEnsino()
    {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Ensino Superior");
        Curso curso = new Curso(tipoEnsino);
        assertEquals("Ensino Superior", curso.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNuloConstrutor() {
        try
        {
            Curso curso = new Curso(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Tipo de Ensino Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNulo() {
        try
        {
            Curso curso = new Curso(new TipoEnsino());
            curso.setTipoEnsino(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Tipo de Ensino Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor()
    {
        Professor professor = new Professor();
        professor.setNome("Joao");
        Escola escola = new Escola();
        escola.setDirecao(professor);
        Curso curso = new Curso(new TipoEnsino());
        curso.setEscola(escola);
        assertEquals("Joao", curso.getNomeDiretor());
    }

    @Test
    void deveRetornarCursoSemEscola()
    {
        Curso curso = new Curso(new TipoEnsino());
        assertEquals("Curso sem escola", curso.getNomeDiretor());
    }

    @Test
    void deveRetornarNomeCoordenador()
    {
        Professor coordenador = new Professor();
        coordenador.setNome("Maria");
        Curso curso = new Curso(new TipoEnsino());
        curso.setCoordenacao(coordenador);
        assertEquals("Maria", curso.getNomeCoordenacao());
    }

    @Test
    void deveRetornarCursoSemCoordenadorNome()
    {
        Curso curso = new Curso(new TipoEnsino());
        assertEquals("Curso sem coordenador", curso.getNomeCoordenacao());
    }

    @Test
    void deveRetornarEscolaridadeDoCoordenador()
    {
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso(new TipoEnsino());
        curso.setCoordenacao(coordenador);
        assertEquals("Mestrado", curso.getEscolaridadeCoordenacao());
    }

    @Test
    void deveRetornarCursoSemCoordenadorEscolaridade()
    {
        Curso curso = new Curso(new TipoEnsino());
        assertEquals("Curso sem coordenador", curso.getEscolaridadeCoordenacao());
    }

}