package com.mycompany.banco1;

import java.util.Scanner;
import java.util.ArrayList;

public class Banco1 {

    public static void main(String[] args) {
        //crear un objeto de la clase CuentaBancaria
        //ejecutar todos los métodos desde el objeto
        int numCuenta;
        String nombCliente;
        float saldo;
        int cvv;
        double cantidad;
        CuentaBancaria cuentaB = null;
        CuentaBancaria cuentaB2 = null;
        Scanner entrada = new Scanner(System.in);
        int opc, tipoC;
        ArrayList<CuentaBancaria> listaCuentas = new ArrayList();
        CuentaDebito cd = null;
        CuentaCredito cc = null;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Crear 2 cuentas");
            System.out.println("2. Mostrar datos de las cuentas ");
            System.out.println("63. Salir");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1: // crear la cuenta
                    System.out.println("¿Número de cuenta? ");
                    numCuenta = entrada.nextInt(); //lee un entero
                    entrada.nextLine(); //limpia el buffer
                    System.out.println("¿Nombre del cliente? ");
                    nombCliente = entrada.nextLine();//lee un String
                    System.out.println("¿Saldo inicial? ");
                    saldo = entrada.nextFloat();//lee un float
                    System.out.println("¿CVV? ");
                    cvv = entrada.nextInt();
                    System.out.println("Tipo de cuenta: 1. Debito 2. Credito 3. Cancelar");
                    tipoC = entrada.nextInt();
                    entrada.nextInt();
                    switch (tipoC) {
                        case 1://crea la cuenta de debito
                            break;
                        case 2://crea la cuenta de credito
                            break;
                        case 3:
                            System.out.println("Operacion cancelada");
                            break;
                        default:
                            System.out.println("Operacion invalida");
                    }
                    break;
              
                case 2: //Mostrar los datos de la cuenta
                    System.out.println(cuentaB.toString());
                    System.out.println("Número de cuenta "
                            + cuentaB.getNumCuenta());
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opc != 3);

        System.out.println(cuentaB.toString());
    }
}
