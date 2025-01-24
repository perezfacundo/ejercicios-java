
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Por favor, ingrese su edad.");
        int edad = Entrada.nextInt();

        if (edad < 0) {
            System.out.println("Debe ingresar valores validos en cuanto a edad");
        } else {

            if (edad <= 2) {
                System.out.println("Bebé");

            } else {
                if (edad <=8) {
                    System.out.println("Es niño");

                } else {
                    if (edad <= 13){
                        System.out.println("Es preadolescente");

                    } else {
                        if (edad < 18){
                            System.out.println("Es adolescente");

                        } else {
                            if (edad < 60) {
                                System.out.println("Es adulto");
                            } else {
                                System.out.println("Es adulto mayor");
                            }
                        }
                    }
                }
            }
        }
    }
}