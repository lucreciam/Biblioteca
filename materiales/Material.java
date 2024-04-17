package materiales;

public class Material {

    private String titulo;
    private Estado estado;

    public Material(String titulo, Estado estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public Material(String titulo)
    {
        this.titulo = titulo;
        this.estado = Estado.DISPONIBLE;;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Material{" +
                "TITULO ='" + titulo + '\'';
    }


}
