import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

  public static void main(String[] args) {
    // crear un objeto de la clase CuentaBancaria
    // ejecutar todos los métodos desde el objeto
    int numCuenta;
    String nombCliente;
    float saldo;
    int cvv;
    double cantidad;
    Scanner entrada = new Scanner(System.in);
    int opc, tipoCuenta;
    ArrayList<CuentaBancaria> listaCuentas = new ArrayList();
    CuentaDebito cd = null;
    CuentaCredito cc = null;
    do {
      System.out.println("Seleccione una opcion");
      System.out.println("1. Crear cuentas");
      System.out.println("2. Mostrar datos de las cuentas");
      System.out.println("3. Salir");
      opc = entrada.nextInt();
      entrada.nextLine();
      switch (opc) {
        case 1: // crear la cuenta
          System.out.println("¿Número de cuenta? ");
          numCuenta = entrada.nextInt(); // lee un entero
          entrada.nextLine(); // limpia el buffer
          System.out.println("¿Nombre del cliente? ");
          nombCliente = entrada.nextLine();// lee un String
          System.out.println("¿CVV? ");
          cvv = entrada.nextInt();
          System.out.println("¿Tipo de cuenta 1. Débito, 2. Crédito, 3. Cancelar ?");
          tipoCuenta = entrada.nextInt();
          entrada.nextLine();
          switch (tipoCuenta) {
            case 1: // crear una cuenta de débito
              System.out.println("Saldo inicial? ");
              saldo = entrada.nextFloat();
              entrada.nextLine();
              cd = new CuentaDebito(numCuenta, nombCliente, saldo, cvv);
              listaCuentas.add(cd);
              break;
            case 2: // crear una cuenta de crédito
              System.out.println("Anualidad? ");
              float anualidad = entrada.nextFloat();
              entrada.nextLine();
              System.out.println("Límite de crédito? ");
              float limCredito = entrada.nextFloat();
              entrada.nextLine();
              cc = new CuentaCredito(anualidad, limCredito, numCuenta, nombCliente, 0, cvv);
              listaCuentas.add(cc);
              break;
            case 3:
              System.out.println("Operación cancelada");
              break;
            default:
              System.out.println("Opción no válida");
          }
          break;
        case 2: // mostrar datos de las cuentas
          for (int i = 0; i < listaCuentas.size(); i++) {
            CuentaBancaria cuenta = listaCuentas.get(i);
            if (cuenta instanceof CuentaDebito) {
              // se realiza el CASTING (CONVERSIÓN)
              CuentaDebito cuentaD = (CuentaDebito) cuenta;
              System.out.println(cuentaD.toString());
            } else {
              CuentaCredito cuentaC = (CuentaCredito) cuenta;
              System.out.println(cuentaC.toString());
            }
          }
          break;
        case 3: // Salir
          System.out.println("Adios");
          break;
        default:
          System.out.println("Opción no válida");
      }
    } while (opc != 3);

    CuentaBancaria baca= new CuentaBancaria( numCuenta,  nombCliente,  saldo,  cvv); //Error al intentar generar un objeto de la una clase abtracta
  }
}
