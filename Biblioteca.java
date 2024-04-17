import materiales.DVD;
import materiales.Libro;
import materiales.Material;
import materiales.Revista;
import prestamo.Prestamo;
import usuarios.Estudiante;
import usuarios.Profesor;
import usuarios.Usuario;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Biblioteca
{
    //Atributos: Gestion general de la tienda
    private final List<Usuario> usuarios;
    private final List<Material> materiales;
    private final List<Prestamo> prestamos;

    //private final MenuBiblioteca menu;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.materiales = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        //this.menu = (menuVisual) ? new MenuVisualBiblioteca(this) : new MenuConsolaBiblioteca(this);
    }

    //Agregar Usuario
    public void agregarUsuario()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Agregar Usuario");
        System.out.println("1. Estudiante");
        System.out.println("2. Profesor");
        System.out.print("Seleccione el tipo de usuario (1 o 2): ");
        int tipoUsuario = scanner.nextInt();

        scanner.nextLine();

        String tipoIdentificador = (tipoUsuario == 1) ? "legajo" : "matrícula";
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el " + tipoIdentificador + ": ");
        int id = Integer.parseInt(scanner.nextLine());

        // Crear el objeto Usuario según el tipo
        Usuario usuario = (tipoUsuario != 1) ? new Profesor(id, nombre, apellido) : new Estudiante(id, nombre, apellido);

        // Agregar el usuario a la lista
        usuarios.add(usuario);
        System.out.println("Usuario agregado correctamente.");
    }

    //Buscar Usuario
    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : this.usuarios) {
            if (id == usuario.getId()){
                return usuario;
            }
        }
        return null; // Si no se encuentra ningún usuario con el ID dado
    }

    //Mostrar Usuarios
    public void mostrarUsuarios() {
        if (this.usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Usuarios registrados:");
            for (Usuario usuario : this.usuarios) {
                System.out.println(usuario);
            }
        }
    }
    public void listarPrestamos() {

        System.out.println("Lista de préstamos:");
        if (this.prestamos.isEmpty()) {
                System.out.println("No hay préstamos registrados.");
        } else {
            for (Prestamo prestamo : this.prestamos) {
                    System.out.println(prestamo);
            }
        }

    }

    public void agregarMaterial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de material (libro, revista, DVD): ");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el título del material: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del material: ");
        String autor = scanner.nextLine();

        Material nuevoMaterial = null;

        switch (tipo.toLowerCase()) {
            case "libro":
                nuevoMaterial = new Libro(titulo);
                break;
            case "revista":
                nuevoMaterial = new Revista(titulo);
                break;
            case "dvd":
                nuevoMaterial = new DVD(titulo);
                break;
            default:
                System.out.println("Tipo de material no válido.");
                return;
        }

        materiales.add(nuevoMaterial);
        System.out.println("Material agregado con éxito: " + nuevoMaterial);
    }


    //Buscar material por ID
    public Material buscarMaterial(int id) {

    }


    public void realizarPrestamo(Usuario usuario, Material material) {

    }

    public void realizarDevolucion(Prestamo prestamo) {

    }



}