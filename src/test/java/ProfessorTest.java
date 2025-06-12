import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarNomeEscolaridade()
    {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade()
    {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarNomeTipoEnsino()
    {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Ensino Superior");
        Curso curso = new Curso(tipoEnsino);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Ensino Superior", professor.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarTipoEnsinoVazio()
    {
        Professor professor = new Professor();
        assertEquals("Professor sem curso", professor.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarNomeDiretor()
    {
        Professor diretor = new Professor();
        diretor.setNome("Joao");
        Professor professor = new Professor();
        Curso curso = new Curso(new TipoEnsino());
        professor.setContratacao(curso);
        Escola escola = new Escola();
        curso.setEscola(escola);
        escola.setDirecao(diretor);
        assertEquals("Joao", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarProfessorSemCurso()
    {
        Professor professor = new Professor();
        assertEquals("Professor sem curso", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarNomeCoordenadorDoProfessor() {
        Professor coordenador = new Professor();
        coordenador.setNome("Maria");

        Curso curso = new Curso(new TipoEnsino());
        curso.setCoordenacao(coordenador);

        Professor professor = new Professor();
        professor.setContratacao(curso);

        assertEquals("Maria", professor.getContratacao().getNomeCoordenacao());
    }

    @Test
    void deveRetornarCursoSemCoordenadorParaNomeCoordenador() {
        Curso curso = new Curso(new TipoEnsino());
        Professor professor = new Professor();
        professor.setContratacao(curso);

        assertEquals("Curso sem coordenador", professor.getContratacao().getNomeCoordenacao());
    }
}