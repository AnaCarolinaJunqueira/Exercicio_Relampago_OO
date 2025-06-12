public class Aluno extends Pessoa {
    private Curso curso;

    public Curso getCurso()
    {
        return curso;
    }

    public void setCurso(Curso curso)
    {
        this.curso = curso;
    }

    public String getEstadoOndeEstuda()
    {
        if (this.curso == null || this.curso.getEscola() == null)
        {
            return "Aluno sem curso ou escola";
        }
        else
        {
            Escola escola = this.curso.getEscola();
            Professor diretor = escola.getDirecao();
            if (diretor != null)
            {
                return diretor.getNomeEstadoNaturalidade();
            }
            else
            {
                return "Escola sem diretor";
            }
        }
    }

    public String getNomeCoordenadorDoCurso()
    {
        if (this.curso == null)
        {
            return "Aluno sem curso";
        }
        else
        {
            return this.curso.getNomeCoordenacao();
        }
    }
}
