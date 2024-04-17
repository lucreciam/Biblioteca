package usuarios;

public class Estudiante extends Usuario{

    private int prestamosTotales;



    public Estudiante(int id, String nombre, String apellido, int prestamosTotales) {
        super(id, nombre, apellido);
        this.prestamosTotales = prestamosTotales;

    }
    public Estudiante(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.prestamosTotales = 0;

    }

    public int getPrestamosTotales() {
        return prestamosTotales;
    }

    public void setPrestamosTotales(int prestamosTotales) {
        this.prestamosTotales = prestamosTotales;
    }

    @Override
    public String toString() {
        return "Estudiante" +
                "prestamosTotales=" + prestamosTotales;
    }
}
