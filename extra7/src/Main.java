import java.util.Scanner;

public class Main {

    /* Realizar un programa que muestre por pantalla las palabras que sean
    ingresadas por teclado hasta que se ingrese la palabra "SALIR"*/

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String Palabra = "";

        while (!Palabra.equalsIgnoreCase("salir")){
            System.out.println("Ingrese la palabra que desee mostrar por consola. Ingrese 'Salir' para salir. ");
            Palabra = Entrada.next();
            System.out.println("La palabra ingresada fue: " + Palabra);
        }

        System.out.println("Usted decidio salir");

    }
}