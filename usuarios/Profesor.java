package usuarios;

public class Profesor extends Usuario{


    private int prestamosTotales;

    public Profesor(int id, String nombre, String apellido, int prestamosTotales) {
        super(id, nombre, apellido);
        this.prestamosTotales = prestamosTotales;
    }

    public Profesor(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.prestamosTotales = 0;
    }

    public int getPrestamosTotales() {
        return prestamosTotales;
    }

    public void setPrestamosTotales(int prestamosTotales) {
        this.prestamosTotales = prestamosTotales;
    }

}
