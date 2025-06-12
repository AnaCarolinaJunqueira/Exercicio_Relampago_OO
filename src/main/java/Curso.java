public class Curso {
    private TipoEnsino tipoEnsino;
    private Escola escola;
    private Professor coordenacao;

    public Curso(TipoEnsino tipoEnsino)
    {
        this.setTipoEnsino(tipoEnsino);
        this.escola = null;
    }

    public TipoEnsino getTipoEnsino()
    {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino)
    {
        if (tipoEnsino == null)
        {
            throw new IllegalArgumentException("Tipo de Ensino Invalido");
        }
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola()
    {
        return this.escola;
    }

    public void setEscola(Escola escola)
    {
        this.escola = escola;
    }

    public String getNomeTipoEnsino()
    {
        return this.tipoEnsino.getNome();
    }

    public String getNomeDiretor()
    {
        if (this.escola == null)
        {
            return "Curso sem escola";
        }
        else
        {
            return this.escola.getNomeDiretor();
        }
    }

    public Professor getCoordenacao()
    {
        return this.coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNomeCoordenacao()
    {
        if(this.coordenacao == null)
        {
            return "Curso sem coordenador";
        }
        else
        {
            return this.coordenacao.getNome();
        }
    }

    public String getEscolaridadeCoordenacao()
    {
        if(this.coordenacao == null)
        {
            return "Curso sem coordenador";
        }
        else
        {
            return this.coordenacao.getNomeEscolaridade();
        }
    }
}
