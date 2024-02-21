

package com.mycompany.banco;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //crear un objeto en CuentaBancaria.java
        //ejecutar todos los metodos desde el objeto
        int numCuenta,cvv;
        String nomCliente;
        float saldo;
        CuentaBancaria cuentab;//Variable del objeto
        
        //Leer variables
        System.out.println("Numero de cuenta: ");
        numCuenta = sc.nextInt();
        sc.nextLine();//Limpia el buffer despues de leer un entero y querer segur leyendo
        System.out.println("Nombre del cliente: ");
        nomCliente = sc.nextLine();//Leer String 
        System.out.println("Saldo: ");
        saldo = sc.nextFloat();
        System.out.println("CVV: ");
        cvv = sc.nextInt();
        
        cuentab= new CuentaBancaria(numCuenta,cvv,nomCliente,saldo);
        double cantidad;
        System.out.println("¿Que cantidad quieres retirar? ");
        cantidad = sc.nextDouble();
        cuentab.retirar(cantidad);
        System.out.println("El saldo actual es: " + cuentab.consultarSaldo());
        
        System.out.println("¿Que cantidad desea depositar? ");
        cantidad = sc.nextDouble();
        cuentab.depositar(cantidad);
        System.out.println("El saldo actual es: " + cuentab.consultarSaldo());
    }
}
