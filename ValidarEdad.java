import java.util.Scanner;

public class ValidarEdad {

    private int edad;
    

    public  void ValidarEdad() throws EdadInvalidaException{

        if(edad < 0){
            throw new EdadInvalidaException("La edad tiene que ser un numero positivo");
        }
        if(edad < 18){
            throw new EdadInvalidaException("Debe ser mayor de edad");
        }

        System.out.println("Edad valida");
    }


    public  void Mostrar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        try {
            ValidarEdad();
            
        } catch (EdadInvalidaException e){
            System.out.println("Error:" + e.getMessage());
        }
        sc.close();
    }
}
