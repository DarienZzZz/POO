import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre, DeptPertenece;
        double salario;
        int horasTrabajadas;
   
        int op;

        do {
            System.out.println("Calcular salario");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Empleado asalariado");
            System.out.println("2. Empleado por hora");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingresa tu nombre");
                nombre=sc.nextLine();
                    break;
                case 2:
                System.out.println("Ingresa tu nombre");
                nombre=sc.nextLine();
                System.out.println("Ingrese las horas trabajadas: ");
                horasTrabajadas=sc.nextInt(); sc.nextLine();
                    EmpleadoAsalariado asa = new EmpleadoAsalariado( nombre,  DeptPertenece,  salario);
                    break;
                case 3:
                    System.out.println("Adios");

                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 3);
    }
    
}
