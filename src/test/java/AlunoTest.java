import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarNomeEstadoNaturalidade()
    {
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        Aluno aluno = new Aluno();
        aluno.setNaturalidade(cidade);
        assertEquals("MG", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNuturalidadeNula()
    {
        Aluno aluno = new Aluno();
        assertEquals("Pessoa sem naturalidade", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNomeCoordenadorDoCurso()
    {
        Professor coordenador = new Professor();
        coordenador.setNome("Maria");

        Curso curso = new Curso(new TipoEnsino());
        curso.setCoordenacao(coordenador);

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        assertEquals("Maria", aluno.getNomeCoordenadorDoCurso());
    }

    @Test
    void deveRetornarAlunoSemCursoParaNomeCoordenador()
    {
        Aluno aluno = new Aluno();
        assertEquals("Aluno sem curso", aluno.getNomeCoordenadorDoCurso());
    }

    @Test
    void deveRetornarEstadoOndeAlunoEstudaPeloDiretor()
    {
        Estado estado = new Estado();
        estado.setNome("MG");

        Cidade cidade = new Cidade(estado);

        Professor diretor = new Professor();
        diretor.setNaturalidade(cidade);

        Escola escola = new Escola();
        escola.setDirecao(diretor);

        Curso curso = new Curso(new TipoEnsino());
        curso.setEscola(escola);

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        assertEquals("MG", aluno.getEstadoOndeEstuda());
    }

    @Test
    void deveRetornarAlunoSemCursoParaEstado()
    {
        Aluno aluno = new Aluno();
        assertEquals("Aluno sem curso ou escola", aluno.getEstadoOndeEstuda());
    }

    @Test
    void deveRetornarEscolaSemDiretorParaEstadoDoAluno()
    {
        Curso curso = new Curso(new TipoEnsino());
        Escola escola = new Escola();
        curso.setEscola(escola);

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        assertEquals("Escola sem diretor", aluno.getEstadoOndeEstuda());
    }
}
