public class CuentaDebito extends CuentaBancaria {

    public CuentaDebito(int numCuenta, String nombCliente, float saldo, int cvv) {
      super(numCuenta, nombCliente, saldo, cvv);
    }
  
  //método depositar recibe una cantidad que
  //se sumará al saldo
    abstract depositar(double cantidad){ //al comvertirlas a abstractas generaron errores
      saldo += cantidad;
  //la instrucción equivale a
  //saldo=saldo+cantidad
    }
  
  //método retirar recibe una cantidad que
  //se restará al saldo
    abstract retirar(double cantidad){//al comvertirlas a abstractas generaron errores
      if (haySaldo(cantidad))
        saldo -= cantidad;
      else
        System.out.println("Fondos insuficientes");
    }
  //el método haySaldo retorna verdadero si
  //el saldo es mayor o igual a una cantidad
  //o retorna falso en caso contrario.
    private boolean haySaldo(double cantidad){
      if (saldo >= cantidad)
        return true;
     else
       return false;
    }
  
    @Override
    public String toString() {
       return super.toString()+ " Cuenta Debito{"+ '}';
    }
  
  }