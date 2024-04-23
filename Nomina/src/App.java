import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre, DeptPertenece;
        double salario=120, salarioA=2000;
        int horasTrabajadas, nacimiento=0;
                System.out.println("Ingresa tu nombre");
                nombre=sc.nextLine();
                System.out.println("Ingrese las horas trabajadas: ");
                horasTrabajadas=sc.nextInt(); sc.nextLine();
                Empleado hora = new EmpleadoPorHora( nombre, salario, horasTrabajadas, nacimiento);
                hora.Departamento();
                System.out.println("Su salario es" + hora.calcularSalario());

                System.out.println("Ingresa tu nombre");
                nombre=sc.nextLine();
                Empleado asa = new EmpleadoAsalariado(nombre, salarioA, nacimiento);
                hora.Departamento();
                System.out.println("Su salario es" + hora.calcularSalario());

            
    }
    
}
