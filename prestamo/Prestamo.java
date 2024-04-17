package prestamo;

import materiales.Material;
import usuarios.Estudiante;
import usuarios.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Prestamo {
    private final Usuario usuario;
    private final Material material;
    private final LocalDate fechaPrestamo;
    private final LocalDate fechaDevolucion;

    //Constructor que directamente me calcula las fechas y cargar los atributos con los datos llegados por parametro
    public Prestamo(Usuario usuario, Material material) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = LocalDate.now(); // Fecha actual

        // Calcular la fecha de devolución según el tipo de usuario
        if (usuario instanceof Estudiante) {
            this.fechaDevolucion = this.fechaPrestamo.plusDays(7);
        } else {
            this.fechaDevolucion = this.fechaPrestamo.plusDays(14);
        }
    }



    //ToString para la muestra del objeto
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formate del tipo date a string para mostrar
        return "Préstamo: \n" +
                "Usuario: " + usuario.getNombre() + "\n" +
                "Material: " + material.getTitulo() + "\n" +
                "Fecha de préstamo: " + fechaPrestamo.format(formatter) + "\n" +
                "Fecha de devolución: " + fechaDevolucion.format(formatter);
    }







}
