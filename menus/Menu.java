package menus;

import java.util.Scanner;

import Biblioteca;


public class Menu {
    private final Biblioteca biblioteca;

    public Menu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void mostrarMenu() {

        System.out.println("1. Cargar usuarios");
        System.out.println("2. Listar usuarios");
        System.out.println("3. Generar préstamos");
        System.out.println("4. Listar préstamos");
        System.out.println("5. Mostrar materiales");
        System.out.println("6. Agregar materiales");
        System.out.println("0. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        procesarOpcion(opcion);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                biblioteca.cargarUsuarios();
                break;
            case 2:
                biblioteca.listarUsuarios();
                break;
            case 3:
                biblioteca.generarPrestamos();
                break;
            case 4:
                biblioteca.listarPrestamos();
                break;
            case 5:
                biblioteca.mostrarMateriales();
                break;
            case 6:
                biblioteca.agregarMaterial();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}
