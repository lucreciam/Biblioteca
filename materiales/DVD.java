package materiales;

public class DVD extends Material{

    public DVD(String nombre) {
        super(nombre,Estado.DISPONIBLE);
    }

    public void cambiarEstadoEnSala()
    {
        this.setEstado(Estado.CONSULTA_SALA);
    }

    public void cambiarEstadoDisponible()
    {
        this.setEstado(Estado.DISPONIBLE);
    }


    @Override
    public String toString() {
        return "DVD";
    }
}
