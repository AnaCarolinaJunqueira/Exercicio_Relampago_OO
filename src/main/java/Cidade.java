public class Cidade {
    private Estado estado;

    public Cidade (Estado estado)
    {
        this.setEstado(estado);
    }

    public Estado getEstado()
    {
        return this.estado;
    }

    public void setEstado(Estado estado)
    {
        if (estado == null)
        {
            throw new IllegalArgumentException("Estado Invalido");
        }
        this.estado = estado;
    }

    public String getNomeEstado()
    {
        return this.estado.getNome();
    }
}
