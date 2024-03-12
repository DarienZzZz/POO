/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco1;

/**
 *
 * @author SALA PAFP 28
 */
public class CuentaCredito extends CuentaBancaria {

    float anua, limiteCredito;

    public CuentaCredito(float anua, float limCredito, int numCuenta, String nombCliente, float saldo, int cvv) {
        super(numCuenta, nombCliente, saldo, cvv);
        this.anua = anua;
        this.limiteCredito = limCredito;
    }

    //Depositar decrementa el saldo  y dismunye el limite de credito
    public void depositar(double cantidad) {
        saldo -= cantidad;
        limiteCredito += cantidad;
    }

    //Retiro verifica si hay saldo en el limite de credito, si hay saldo aumenta el saldo y disminuye el limite de credito
    public void retirar(double cantidad) {
        if (limiteCredito >= cantidad) {
            saldo += cantidad;
            limiteCredito -= cantidad;
        }
    }
    //toString muesra los datos de cuenta de credito

    @Override
    public String toString() {
        return super.toString() + "CuentaCredito{" + "anua=" + anua + ", limiteCredito=" + limiteCredito + '}';
    }

}
