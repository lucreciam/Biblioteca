package materiales;

public class Libro extends Material implements Prestable{

    public Libro(String nombre) {
        super(nombre, Estado.DISPONIBLE);
    }


    @Override
    public String toString() {
        return "Libro";
    }

    @Override
    public void prestar() {
        if (this.getEstado() == Estado.DISPONIBLE) {
            this.setEstado(Estado.EN_PRESTAMO);

        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    @Override
    public void devolver() {
        this.setEstado(Estado.DISPONIBLE);
    }
}
