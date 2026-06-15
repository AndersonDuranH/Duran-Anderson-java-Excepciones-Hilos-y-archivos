public class DescargaArchivos extends Thread{

    public DescargaArchivos(String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        try{
            for(int i=0; i <= 100; i += 20){
                System.out.println(getName() + " -> " + i + " %");
                Thread.sleep(1000);
            }

            System.out.println(getName() + "Completado.");

        }catch (InterruptedException e){
            System.out.println( "Error en la descarga." + getName());
        }   
    }

    public static void Mostrar(){
        DescargaArchivos HiloPrincipal = new DescargaArchivos("Descargando Archivo1...");
        DescargaArchivos HiloSecundario = new DescargaArchivos("Descargando Archivo2...");
        DescargaArchivos HiloTercero = new DescargaArchivos("Descargando Archivo3...");
        HiloPrincipal.start();
        HiloSecundario.start();
        HiloTercero.start();
    }
}