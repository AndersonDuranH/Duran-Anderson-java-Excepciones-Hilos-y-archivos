## HILOS, EXCEPCIONES Y ARCHIVOS

## ESTUDIANTE:
NOMBRE: Anderson Duran Hernandez

## MATRICULA:
MATRICULA: 10005367

## MATERIA:
Programacion 3

## DESCRIPCION:

Este proyecto consiste en una aplicación de consola desarrollada en Java que integra ejercicios relacionados con el manejo de Hilos, Excepciones y Archivos. El objetivo principal es poner en práctica conceptos fundamentales de programación concurrente, manejo de errores y persistencia de información mediante archivos de texto.

La aplicación presenta un menú principal que permite seleccionar cualquiera de los cinco ejercicios desarrollados. Cada ejercicio funciona de manera independiente y demuestra el uso de una característica específica del lenguaje Java.

Las funcionalidades incluidas en el sistema son:

### Ejercicio 1 - Simulador de Descargas

Simula la descarga simultánea de tres archivos utilizando hilos independientes. Cada hilo muestra su progreso desde 0% hasta 100% y notifica cuando la descarga ha finalizado.

### Ejercicio 2 - Carrera de Corredores

Simula una carrera entre cuatro corredores utilizando hilos. Cada corredor avanza desde el metro 1 hasta el metro 10, mostrando su progreso en pantalla. Además, se muestran los estados inicial y final de los hilos y se identifica al corredor ganador.

### Ejercicio 3 - Validador de Edad

Solicita una edad al usuario y verifica si es válida. Si la edad es menor de 18 años o negativa, se lanza una excepción personalizada llamada EdadInvalidaException mostrando un mensaje de error apropiado.

### Ejercicio 4 - Calculadora Segura

Permite realizar operaciones básicas como suma, resta, multiplicación y división. El sistema maneja errores de entrada y excepciones como división entre cero mediante bloques try-catch-finally.

### Ejercicio 5 - Registro de Actividades

Permite registrar actividades en un archivo de texto llamado Actividades.txt y posteriormente mostrar todas las actividades almacenadas. Utiliza lectura y escritura de archivos mediante BufferedWriter y BufferedReader.

### Menú Principal

Permite al usuario seleccionar cualquiera de los ejercicios disponibles y ejecutarlos desde una única aplicación.

## COMO EJECUTAR CADA EJERCICIO

1. Ejecutar la clase Main.java.
2. Aparecerá el menú principal.
3. Seleccionar una opción del 1 al 5 según el ejercicio que se desee ejecutar.
4. Seguir las instrucciones mostradas en pantalla.
5. Para finalizar el programa, seleccionar la opción correspondiente de salida.

## TECNOLOGIAS UTILIZADAS

Java  
JDK 25  
Visual Studio Code

### Estructura del Proyecto

```text
HilosExcepcionesYarchivos
├── ImagenesEjercicio1
├── ImagenesEjercicio2
├── ImagenesEjercicio3
├── ImagenesEjercicio4
├── ImagenesEjercicio5
├── Archivos.java
├── CalculadoraSegura.java
├── CarreraCorredores.java
├── DescargaArchivos.java
├── EdadInvalidaException.java
├── Main.java
├── ValidarEdad.java
├── Actividades.txt
└── README.md
```

## EVIDENCIAS

Las capturas de pantalla de ejecución de cada ejercicio se encuentran almacenadas en las carpetas:

- ImagenesEjercicio1
- ImagenesEjercicio2
- ImagenesEjercicio3
- ImagenesEjercicio4
- ImagenesEjercicio5

Cada carpeta contiene las evidencias correspondientes a la ejecución correcta de cada ejercicio solicitado.
