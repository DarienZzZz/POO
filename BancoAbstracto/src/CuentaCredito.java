public class CuentaCredito extends CuentaBancaria {
    float anualidad;
    float limiteCredito;
  
    public CuentaCredito(float anualidad, float limiteCredito, int numCuenta, String nombCliente, float saldo, int cvv) {
      super(numCuenta, nombCliente, saldo, cvv);
      this.anualidad = anualidad;
      this.limiteCredito = limiteCredito;
    }
  
  // depositar decrementa el saldo y aumenta el
  // límite de crédito
    abstract depositar(double cantidad){//al comvertirlas a abstractas generaron errores
      saldo -= cantidad;
      limiteCredito += cantidad;
    }
  
  // retirar verifica si hay saldo en el limite
  // de crédito. Si hay crédito, aumenta el saldo
  // y disminuye el limite de crédito
    abstract retirar(double cantidad){//al comvertirlas a abstractas generaron errores
      if (limiteCredito>=cantidad){
       saldo += cantidad;
       limiteCredito -= cantidad;
      }
    }
  
  // toString muestra los datos de la cuenta de
  // crédito
  
    @Override
    public String toString() {
      return super.toString()+" Cuenta Credito{" +"anualidad=" + anualidad +", limiteCredito=" +
  limiteCredito + '}';
    }
  
  }