

package com.mycompany.codigo3_positivo_negativo;
import java.util.Scanner;

/**
 *
 * @author WENDY STEPHANIE
 */
public class CODIGO3_POSITIVO_NEGATIVO {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Sumar los dos números
        double suma = num1 + num2;

        // Mostrar el resultado de la suma
        System.out.println("La suma de los dos números es: " + suma);

        // Verificar si el resultado es positivo o negativo
        if (suma > 0) {
            System.out.println("El resultado es positivo.");
        } else if (suma < 0) {
            System.out.println("El resultado es negativo.");
        } else {
            System.out.println("El resultado es cero.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}