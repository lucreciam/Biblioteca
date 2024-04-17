package materiales;

public class Revista extends Material implements Prestable{


    //Constructor
    public Revista(String nombre) {
        super(nombre,Estado.DISPONIBLE);
    }



    //ToString para mostrar

    @Override
    public String toString() {
        return "Revista";
    }

    //Implementacion de Interfaz

    @Override
    public void prestar() {
        if (this.getEstado() == Estado.DISPONIBLE) {
            this.setEstado(Estado.EN_PRESTAMO);

        } else {
            System.out.println("La revista no está disponible para préstamo.");
        }
    }

    @Override
    public void devolver() {
        this.setEstado(Estado.DISPONIBLE);
    }

}
