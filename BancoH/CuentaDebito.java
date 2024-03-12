package com.mycompany.banco1;

public class CuentaDebito extends CuentaBancaria {

    public CuentaDebito(int numCuenta, String nombCliente, float saldo, int cvv) {
        super(numCuenta, nombCliente, saldo, cvv);
    }

    void calcularComision() {
//si el saldo es mayor a 500
// se cobra 1% de comisión sobre el saldo
        double comision;
        if (saldo > 50000) {
            comision = saldo * 0.01;
        } else {
            comision = 0;
        }
        System.out.println("La comisión es " + comision);
    }

//método sobrecargado
    void calcularComision(double cantidad) {
//si el saldo es mayor a 500
// se cobra 1% de comisión sobre el saldo
        double comision;
        if (saldo > 50000) {
            comision = saldo * 0.01 + cantidad;
        } else {
            comision = 0;
        }
        System.out.println("La comisión es " + comision);
    }

//método depositar recibe una cantidad que
//se sumará al saldo
    void depositar(double cantidad) {
        saldo += cantidad;
//la instrucción equivale a
//saldo=saldo+cantidad
    }

//método retirar recibe una cantidad que
//se restará al saldo
    void retirar(double cantidad) {
        if (haySaldo(cantidad)) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
//el método haySaldo retorna verdadero si
//el saldo es mayor o igual a una cantidad
//o retorna falso en caso contrario.

    private boolean haySaldo(double cantidad) {
        if (saldo >= cantidad) {
            return true;
        } else {
            return false;
        }
    }
}
