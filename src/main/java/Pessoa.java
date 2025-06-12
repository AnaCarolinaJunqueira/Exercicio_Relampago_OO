public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade()
    {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade)
    {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade()
    {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade)
    {
        this.naturalidade = naturalidade;
    }

    public String getNomeEscolaridade()
    {
        if (this.escolaridade == null)
        {
            return "Pessoa sem escolaridade";
        }
        else
        {
            return this.escolaridade.getNome();
        }
    }

    public String getNomeEstadoNaturalidade()
    {
        if (this.naturalidade == null)
        {
            return "Pessoa sem naturalidade";
        }
        else
        {
            return this.naturalidade.getNomeEstado();
        }
    }
}
