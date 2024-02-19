
package com.mycompany.banco;


public class CuentaBancaria {
    /*
    1. Crear clase(Esta)
    2. Definir atributos
    3. Definir el constructor   
    4. Metodos (get,set,depositar,retirar,haySaldo)
    */
    int numCuenta,cvv;
    String nomCliente;
    float saldo;

    /*public CuentaBancaria(int numC, int cCvv, String nomC){
        this.numCuenta = numC;
        this.nomCliente = nomC;
        this.cvv = cCvv;
        this.saldo=0;
        */
    
    //con insert code

    public CuentaBancaria(int numCuenta, int cvv, String nomCliente, float saldo) {
        this.numCuenta = numCuenta;
        this.cvv = cvv;
        this.nomCliente = nomCliente;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", cvv=" + cvv + ", nomCliente=" + nomCliente + ", saldo=" + saldo + '}';
    }
   
    //Metodos. metodo depositar recibe una cantidad que se va a sumar al saldo.
    void depositar (double cantidad){
        saldo += cantidad; //saldo=saldo+cantidad
        
    }
    //metodo retitrar recibe una cantidad que se restara al saldo.
    void retirar(double cantidad){
        if(haySaldo(cantidad)){
        saldo-=cantidad;
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
    //SABER SI HAY FONDOS PARA RETIRAR
    boolean haySaldo(double cantidad){
        if (saldo>=cantidad){
            return true;
        }else{
            return false;
        }
    }
    
    
}
