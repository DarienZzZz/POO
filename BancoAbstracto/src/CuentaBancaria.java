public abstract class CuentaBancaria {
    //agregar abstract no genero errores
    // 1. Crear la clase
    // 2. Definir los atributos
    private int numCuenta;
    String nombCliente;
    float saldo;
    int cvv;
    // 3. Definir el constructor

    public CuentaBancaria(int numCuenta, String nombCliente, float saldo, int cvv) {
        this.numCuenta = numCuenta;
        this.nombCliente = nombCliente;
        this.saldo = saldo;
        this.cvv = cvv;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombCliente() {
        return nombCliente;
    }

    public void setNombCliente(String nombCliente) {
        this.nombCliente = nombCliente;
    }

    abstract float consultarSaldo() {//al comvertirlas a abstractas generaron errores
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    // método sobre-escrito
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nombCliente=" + nombCliente + ", saldo="
                + saldo + ", cvv=" + cvv + '}';
    }

}
