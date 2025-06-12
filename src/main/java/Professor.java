public class Professor extends Pessoa{
    private Curso contratacao;

    public Curso getContratacao()
    {
        return contratacao;
    }

    public void setContratacao(Curso contratacao)
    {
        this.contratacao = contratacao;
    }

    public String getNomeTipoEnsino()
    {
        if(this.contratacao == null)
        {
            return "Professor sem curso";
        }
        else
        {
            return this.contratacao.getNomeTipoEnsino();
        }
    }

    public String getNomeDiretor()
    {
        if(this.contratacao == null)
        {
            return "Professor sem curso";
        }
        else
        {
            return this.contratacao.getNomeDiretor();
        }
    }
}
