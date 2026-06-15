import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSegura{
    
    public void Mostrar(){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Seleccione una operacion: ");
            int opcion = sc.nextInt();

            System.out.print("Digite el primer numero: ");
            int num1 = sc.nextInt();

            System.out.print("Digite el segundo numero: ");
            int num2 = sc.nextInt();

            int resultado = 0;

            switch(opcion){
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    return;

            }
            System.out.println("El resultado es: " + resultado);

        }catch (ArithmeticException e){
                System.out.println("Error: no se puede dividir entre cero");
        }catch (InputMismatchException e){
                System.out.println("Error: Debe digitar solo Numeros");
        }finally{
            System.out.println("Proceso finalizado");
            sc.close();
        }
    }

}