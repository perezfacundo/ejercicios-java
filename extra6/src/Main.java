import java.util.Scanner;

public class Main {

    /*Realizar un programa que dado por teclado un limite numerico (por ejemplo 100).
    * Muestre en pantalla todos los numeros hasta ese limite */

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Ingrese por teclado un numero entero para determinar el limite");

        try {
            int numero = Entrada.nextInt();

            for (int i = 0; i < numero; i++) {
                System.out.println(i + 1);
            }
        } catch (RuntimeException e) {
            System.out.println("No es un numero");
        }

    }
}