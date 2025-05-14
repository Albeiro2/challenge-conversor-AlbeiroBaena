package Modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {
static Scanner scanner = new Scanner(System.in);
    public static void mostrarMenu() {
        System.out.println("*");
        System.out.println(" Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("*");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.println();
        System.out.print("Elija una opción válida: ");
        System.out.println();
    }

    public static  void iniciar(){
         int opcion =0;

        do{

            try{
                mostrarMenu();
                opcion = scanner.nextInt();
                convertir(opcion);
            }catch (InputMismatchException e){
                System.out.println("\nValor o numero ingresado no valido!");
                scanner.nextLine();
                opcion = 0;
            }

        }while ((opcion != 7));

    }

    public static void convertir(int opcion){
        double valor = 0;
        if(opcion < 7){
            System.out.print("Ingrese el valor que desea convertir: ");
             valor = scanner.nextDouble();
        }

        MonedaCambio monedaCambio;
        double convercion;
        System.out.println();
        switch (opcion){
            case 1:
                monedaCambio = ConexionApi.obtenerCambio("USD");
                convercion = monedaCambio.getArs() * valor;
                System.out.println("El valor "+valor+ " [USD] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [ARS]");
                break;
            case 2:
                monedaCambio = ConexionApi.obtenerCambio("ARS");
                convercion = monedaCambio.getUsd() * valor;
                System.out.println("El valor "+valor+ " [ARS] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [USD]");
                break;
            case 3:
                monedaCambio = ConexionApi.obtenerCambio("USD");
                convercion = monedaCambio.getBrl() * valor;
                System.out.println("El valor "+valor+ " [USD] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [BRL]");
                break;
            case 4:
                monedaCambio = ConexionApi.obtenerCambio("BRL");
                convercion = monedaCambio.getUsd() * valor;
                System.out.println("El valor "+valor+ " [BRL] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [USD]");
                break;
            case 5:
                monedaCambio = ConexionApi.obtenerCambio("USD");
                convercion = monedaCambio.getCop() * valor;
                System.out.println("El valor "+valor+ " [USD] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [COP]");
                break;
            case 6:
                monedaCambio = ConexionApi.obtenerCambio("COP");
                convercion = monedaCambio.getUsd() * valor;
                System.out.println("El valor "+valor+ " [COP] "+"corresponde al valor final" +
                        " de =>>> "+convercion+ " [USD]");
                break;
            case 7:

                break;
            default:
                System.out.println("Opcion de menu no valido!"); break;
        }
    }
}
