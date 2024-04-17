package usuarios;

public class Usuario {

    private final int id;
    private String nombre;
    private String apellido;

    public Usuario(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        String tipoUsuario = (this instanceof Estudiante) ? "Estudiante" : "Profesor";
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Tipo: " + tipoUsuario;
    }
}
