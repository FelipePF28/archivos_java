// Main.java
// Programa de consola que solicita datos de un vehículo y los muestra formateados.
// Cumple con: uso de Scanner(System.in), variables String/int, salida por System.out,
// compilación/ejecución por línea de comandos y comentarios en cada línea.

import java.util.Scanner; // Importa la clase Scanner para leer desde el teclado

public class Main { // Declara la clase pública Main (punto de entrada del programa)
    public static void main(String[] args) { // Método main: inicio del programa
        Scanner sc = new Scanner(System.in); // Crea un Scanner asociado a la entrada estándar

        // Declaración de variables (String e int), como solicita la actividad
        String marca; // Almacena la marca ingresada
        String modelo; // Almacena el modelo ingresado
        int cilindrada; // Almacena la cilindrada en CC (entero)
        String tipoCombustible; // Almacena el tipo de combustible ingresado
        int capacidadPasajeros; // Almacena la capacidad de pasajeros (entero)

        // Solicitud de datos al usuario
        System.out.print("Ingrese la marca: "); // Pide marca
        marca = sc.nextLine(); // Lee la línea completa para marca

        System.out.print("Ingrese el modelo: "); // Pide modelo
        modelo = sc.nextLine(); // Lee la línea completa para modelo

        System.out.print("Ingrese la cilindrada (en CC, solo números): "); // Pide cilindrada
        cilindrada = Integer.parseInt(sc.nextLine().trim()); // Convierte el texto a int de forma segura

        System.out.print("Ingrese el tipo de combustible (Gasolina, Diésel, Híbrido, Eléctrico, etc.): "); // Pide combustible
        tipoCombustible = sc.nextLine(); // Lee la línea completa para tipo de combustible

        System.out.print("Ingrese la capacidad de pasajeros (solo números): "); // Pide capacidad
        capacidadPasajeros = Integer.parseInt(sc.nextLine().trim()); // Convierte a int

        // Salida formateada según el enunciado
        System.out.println(); // Imprime una línea en blanco para separar
        System.out.println("Datos de Salida:"); // Encabezado de salida
        System.out.println("La marca que ha ingresado es: " + marca); // Muestra marca
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " CC"); // Muestra cilindrada
        System.out.println("El tipo de combustible es: " + tipoCombustible); // Muestra combustible
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros."); // Muestra capacidad

        sc.close(); // Cierra el Scanner para liberar el recurso
    } // Fin del método main
} // Fin de la clase Main
