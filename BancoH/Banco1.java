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
         float anua, limiteCredito;
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
                             System.out.println("¿Saldo inicail? ");
                             saldo=entrada.nextFloat();
                             entrada.nextLine();
                             cd=new CuentaDebito( numCuenta,  nombCliente,  saldo,  cvv);
                             listaCuentas.add(cd);
                            break;
                        case 2://crea la cuenta de credito
                            System.out.println("¿Anualidad? ");
                            anua=entrada.nextFloat();
                            System.out.println("¿Limite de Credito? ");
                            anua=entrada.nextFloat();
                            entrada.nextLine();
                            System.out.println("¿Limite de Credito? ");
                            limiteCredito=entrada.nextFloat();
                            entrada.nextLine();
                            cc = new CuentaCredito( anua,  limiteCredito,  numCuenta,  nombCliente,  0,  cvv);
                            listaCuentas.add(cc);
                            break;
                        case 3:
                            System.out.println("Operacion cancelada");
                            break;
                        default:
                            System.out.println("Operacion invalida");
                    }
                    break;
              
                case 2: //Mostrar los datos de la cuenta
                   for (int i = 0; i < listaCuentas.size(); i++) {
            CuentaBancaria cuenta = listaCuentas.get(i);
            System.out.println(cuenta.toString() );
            if (cuenta instanceof CuentaDebito){
                //Se realiza un cambio de CuentaBancaria a CuentaDebito la variable cuenta, usando el "CASTING"
                CuentaDebito cuentaD=(CuentaDebito)cuenta;
                System.out.println(cuentaD.toString());
            }else{
                 CuentaCredito cuentaC = (CuentaCredito)cuenta;
                 System.out.println(cuentaC.toString());
            }
        }
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
