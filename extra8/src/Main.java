import java.util.Scanner;

public class Main {

    /*Ejercicio: estacionamiento*/

    /*Un administrador de un estacionamiento necesita un programa que permita calcular
    el total a pagar de varios clientes que utilizan el servicio.*/

    /*El programa debe solicitar por teclado dos datos. Patente de vehículo y tipo de estacionamiento*/

    /*Los tipos de estacionamiento son tres:
    * Por hora: $3 USD
    * Media jornada: $15 USD con 5% de descuento
    * Jornada completa: $30 USD con 10% de descuento
     */

    /* El programa debe calcular el monto a pagar para cada cliente en función del tipo de estacionamiento seleccionado
    * La carga de datos debe continuar hasta que el usuario ingrese la palabra "fin" en lugar de la patente.*/

    /* Al finalizar el programa debe mostrar por pantalla:
    *
    * La cantidad total de estacionamientos por hora.
    * La cantidad total de estacionamientos de media jornada.
    * La cantidad total de estacionamientos de jornada completa.
    * Y la suma total de ingresos en USD que hubo durante el día. */

    public static void main(String[] args) {

        /* En primer lugar, el programa debe pedir por teclado dos datos:
         * Patente del vehículo.
         * Tipo de estacionamiento.*/

        /* Declaración de variables y objetos necesarios*/
        Scanner Entrada = new Scanner(System.in);
        String Patente = "";
        int tipoEstacionamiento;
        int horas;
        int precioHora = 3;
        double precioMediaJornada = 14.25 ;
        double precioJornadaCompleta = 27;

        /* Declaración de subtotales y totales */
        int cantidadEstHora = 0;
        int cantidadEstMediaJornada = 0;
        int cantidadEstJornadaCompleta = 0;
        double totalCliente;
        double totalDia = 0;

        while(!Patente.equalsIgnoreCase("cierre")){

            /* Resetear variables correspondientes */
            totalCliente = 0;

            /* Lógica de negocio */
            System.out.println("Ingrese por favor la patente del vehículo, o tipee 'cierre' para cerrar el turno");
            Patente = Entrada.next();

            if (!Patente.equalsIgnoreCase("cierre")){
                System.out.println("Ingrese el número (1, 2 ó 3) del tipo de estacionamiento que corresponda según:");
                System.out.println("1. Por hora \n2. Por media jornada \n3. Por Jornada completa");
                tipoEstacionamiento = Integer.parseInt(Entrada.next());


                switch(tipoEstacionamiento) {
                    case 1:
                        System.out.println("Redondeando hacia arriba, ¿ cuántas horas estacionó el cliente ?");
                        horas = Entrada.nextInt();
                        totalCliente = horas * precioHora;

                        cantidadEstHora++;
                        break;

                    case 2:
                        totalCliente = precioMediaJornada;

                        cantidadEstMediaJornada++;
                        break;

                    case 3:
                        totalCliente = precioJornadaCompleta;

                        cantidadEstJornadaCompleta++;
                        break;
                }

                System.out.println("El total a pagar por el cliente es $" + totalCliente + " USD");

                totalDia += totalCliente;
                System.out.println("Recaudado hasta el momento: $" + totalDia + " USD.");
            } else {
                System.out.println("Ha decidido realizar el cierre");
            }
        }

        System.out.println("A continuación se le mostrarán los totales del día.");

        if (cantidadEstHora == 1){
            System.out.println("Cantidad de estacionamientos por hora: " + cantidadEstHora + " estacionamiento.");
        } else {
            System.out.println("Cantidad de estacionamientos por hora: " + cantidadEstHora + " estacionamientos.");
        }

        if (cantidadEstMediaJornada == 1){
            System.out.println("Cantidad de estacionamientos por media jornada: " + cantidadEstMediaJornada + " estacionamiento.");
        } else {
            System.out.println("Cantidad de estacionamientos por media jornada: " + cantidadEstMediaJornada + " estacionamientos.");
        }

        if (cantidadEstJornadaCompleta == 1){
            System.out.println("Cantidad de estacionamientos por jornada completa: " + cantidadEstJornadaCompleta + " estacionamiento.");
        } else {
            System.out.println("Cantidad de estacionamientos por jornada completa: " + cantidadEstJornadaCompleta + " estacionamientos.");
        }

        System.out.println("Total de ganancias del día: $" + totalDia + " USD");

        /* calcular y mostrar subtotales ej: dinero facturado en estacionamientos por hora */

    }
}