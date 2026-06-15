import java.io.*;
import java.util.Scanner;

public class Archivos {

    public static void Mostrar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n1. Agregar Actividades");
            System.out.println("2. Mostrar Actividades");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    AgregarActividades(sc);
                    break;

                case 2:
                    MostrarActividades();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 3);

        sc.close();
    }

    public static void AgregarActividades(Scanner sc) {

        try {

            System.out.print("Ingrese una Actividad: ");
            String actividad = sc.nextLine();

            File archivo = new File(
                "C:\\Users\\ander\\OneDrive\\Pictures\\PROGRAMACION 3\\HilosExcepcionesYarchivos\\Actividades.txt"
            );

            BufferedWriter bw = new BufferedWriter(
                new FileWriter(archivo, true)
            );

            bw.write(actividad);
            bw.newLine();

            bw.close();

            System.out.println("Actividad guardada correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar la actividad");
        }
    }

    public static void MostrarActividades() {

        try {

            File archivo = new File(
                "C:\\Users\\ander\\OneDrive\\Pictures\\PROGRAMACION 3\\HilosExcepcionesYarchivos\\Actividades.txt"
            );

            BufferedReader br = new BufferedReader(
                new FileReader(archivo)
            );

            String linea;

            System.out.println("\nActividades Registradas:\n");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {

            System.out.println("No existen actividades registradas");
        }
    }
}