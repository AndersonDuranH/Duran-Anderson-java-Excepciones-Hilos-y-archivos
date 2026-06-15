public static void main(String[] args) {

    ValidarEdad validarEdad = new ValidarEdad();
    CalculadoraSegura calculadoraSegura = new CalculadoraSegura();
    Archivos archivos = new Archivos();

    Scanner sc = new Scanner(System.in);

    System.out.println("Ejercicios");
    System.out.println("1. Ejercicio1");
    System.out.println("2. Ejercicio2");
    System.out.println("3. Ejercicio3");
    System.out.println("4. Ejercicio4");
    System.out.println("5. Ejercicio5");
    System.out.println("6. Salir");
    System.out.print("Seleccione un ejercicio: ");

    int opcion = sc.nextInt();

    switch (opcion) {
        case 1:
            DescargaArchivos.Mostrar();
            break;
        case 2:
            CarreraCorredores.Mostrar();
            break;
        case 3:
            validarEdad.Mostrar();
            break;
        case 4:
            calculadoraSegura.Mostrar();
            break;
        case 5:
            Archivos.Mostrar();
            break;
        case 6:
            System.out.println("Saliendo...");
            break;
        default:
            System.out.println("Opcion no valida");
    }

    sc.close();
}