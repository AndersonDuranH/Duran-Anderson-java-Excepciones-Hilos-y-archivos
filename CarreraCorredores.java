public class CarreraCorredores extends Thread{

    public CarreraCorredores(String nombre){
        super(nombre);
    }

    private static String ganador = null;

    @Override
    public void run(){
        try{
            for(int i = 1; i <= 10; i++){
                System.out.println(getName() + " Avanzo al Metro: " + i);
                Thread.sleep(1000);
            }

            System.out.println(getName() + " Llego a la meta");

            synchronized(CarreraCorredores.class){
                if(ganador == null){
                    ganador = getName();
                    System.out.println("\nEl ganador es: " + ganador);
                }
                System.out.println();
            }

        }catch (InterruptedException e) {
            System.out.println("Error en la carrera: " + getName());
        }
    }


    public static void Mostrar(){
        CarreraCorredores HiloPrincipal = new CarreraCorredores("Juan");
        CarreraCorredores HiloSecundario = new CarreraCorredores("Pedro");
        CarreraCorredores HiloTercero = new CarreraCorredores("Ana");
        CarreraCorredores HiloCuarto = new CarreraCorredores("Carlos");

        System.out.println("\nEstado inicial de los hilos:");
        System.out.println(HiloPrincipal.getName() + ":" + HiloPrincipal.getState());
        System.out.println(HiloSecundario.getName() + ":" + HiloSecundario.getState());
        System.out.println(HiloTercero.getName() + ":" + HiloTercero.getState());
        System.out.println(HiloCuarto.getName() + ":" + HiloCuarto.getState());

        System.out.println("\nLa carrera ha comenzado...");

        HiloPrincipal.start();
        HiloSecundario.start();
        HiloTercero.start();
        HiloCuarto.start();

        try{
            HiloPrincipal.join();
            HiloSecundario.join();
            HiloTercero.join();
            HiloCuarto.join();

        }catch(InterruptedException e){
            System.out.println("Error al esperar los hilos");
        }

        System.out.println("\nEstado final de los hilos:");
        System.out.println(HiloPrincipal.getName() + ": " + HiloPrincipal.getState());
        System.out.println(HiloSecundario.getName() + ": " + HiloSecundario.getState());
        System.out.println(HiloTercero.getName() + ": " + HiloTercero.getState());
        System.out.println(HiloCuarto.getName() + ": " + HiloCuarto.getState());
    }


}
