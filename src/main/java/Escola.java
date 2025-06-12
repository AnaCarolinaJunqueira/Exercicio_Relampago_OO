public class Escola {
    private Professor direcao;

    public Professor getDirecao()
    {
        return direcao;
    }

    public void setDirecao(Professor direcao)
    {
        this.direcao = direcao;
    }

    public String getNomeDiretor()
    {
        if(this.direcao == null)
        {
            return "Escola sem diretor";
        }
        else
        {
            return this.direcao.getNome();
        }
    }
}
