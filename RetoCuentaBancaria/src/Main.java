import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaracion e inicializacion de variables

        Scanner sc = new Scanner(System.in);
        String nombreCliente= "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible= 1599.99;
        int menu =0 ;

        while (menu != 9 || menu < 4) {

            String opciones = """
                ¡Digite la siguiente opcion deseada!
                
                    1- Consultar saldo
                    2- Retirar
                    3- Depositar
                    9- Salir
                """;

            System.out.println(opciones);
            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    System.out.println("""
                        Nombre del cliente: %s
                        Tipo de cuenta cuenta %s
                        Saldo disponible $%.2f""".formatted(nombreCliente, tipoCuenta, saldoDisponible)+
                            "\n--------------------------------------");
                    break;

                case 2:
                    System.out.println("¿Digite el monto del retiro?");
                    double retiro = sc.nextDouble();

                    saldoDisponible -= retiro;

                    if (saldoDisponible >= 0) {
                        System.out.println("""
                        Nombre del cliente: %s
                        Tipo de cuenta cuenta %s
                        Monto retirado %.2f
                        Saldo disponible $%.2f""".formatted(nombreCliente, tipoCuenta,retiro, saldoDisponible)+
                                "\n--------------------------------------");
                    }else {
                        System.out.println("Saldo insuficiente.\n--------------------------------------");
                        saldoDisponible +=retiro;
                    }


                    break;


                case 3:
                    System.out.println("¿Digite el monto del deposito?");
                    double deposito = sc.nextDouble();

                    saldoDisponible += deposito;

                    System.out.println("""
                        Nombre del cliente: %s
                        Tipo de cuenta cuenta %s
                        Monto del deposito %.2f
                        Saldo disponible $%.2f""".formatted(nombreCliente, tipoCuenta,deposito, saldoDisponible)+
                            "\n--------------------------------------");


                    break;

                default:
                    System.out.println("¡Saliendo del sistema!");
                    break;


            }//fin del switch

        }//fin del while

    }//fin del bloque del main

}//fin del bloque de clase

/*
    Nombre cliente: Tony Stark
    Tipo de cuenta: Corriente
    Saldo disponible: 1599.99$

    ¡Digite la siguiente opcion deseada!

    1- Consultar saldo
    2- Retirar
    3- Depositar
    9- Salir

*/