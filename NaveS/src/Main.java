import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<NaveEspacial> inventario;

    public Main() {
        inventario = new ArrayList<>();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Crear una nave");
            System.out.println("2. Buscar una nave");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    crearNave();
                    break;
                case 2:
                    buscarNave();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("¡Programa terminado!");
    }

    private void crearNave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Crear Nave ----");
        System.out.println("Seleccione el tipo de nave:");
        System.out.println("1. Lanzadera");
        System.out.println("2. Sonda Espacial");
        System.out.println("3. Nave Tripulada");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        System.out.println("Ingrese el nombre de la nave:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la velocidad de la nave:");
        double velocidad = scanner.nextDouble();

        switch (opcion) {
            case 1:
                Lanzadera lanzadera = new Lanzadera(nombre, velocidad);
                inventario.add(lanzadera);
                System.out.println("Se creó una nueva lanzadera: " + lanzadera.getNombre());
                break;
            case 2:
                SondaEspacial sonda = new SondaEspacial(nombre, velocidad);
                inventario.add(sonda);
                System.out.println("Se creó una nueva sonda espacial: " + sonda.getNombre());
                break;
            case 3:
                NaveTripulada naveTripulada = new NaveTripulada(nombre, velocidad);
                inventario.add(naveTripulada);
                System.out.println("Se creó una nueva nave tripulada: " + naveTripulada.getNombre());
                break;
            default:
                System.out.println("Opción inválida. No se creó ninguna nave.");
                break;
        }
    }

    private void buscarNave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Buscar Nave ----");
        System.out.println("Ingrese el nombre de la nave a buscar:");
        String nombreBusqueda = scanner.nextLine();

        for (NaveEspacial nave : inventario) {
            if (nave.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Se encontró la nave: " + nave.getNombre());
                return;
            }
        }

        System.out.println("No se encontró ninguna nave con el nombre especificado.");
    }

    private void mostrarInventario() {
        System.out.println("---- Inventario de Naves ----");

        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        for (NaveEspacial nave : inventario) {
            System.out.println("Nombre: " + nave.getNombre() + ", Velocidad: " + nave.getVelocidad());
        }
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.ejecutar();
    }
}


