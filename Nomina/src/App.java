import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double salario = 120, salarioA = 2000;
        int horasTrabajadas, nacimiento = 0;
        int aActual=2024;

        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa su año de nacimiento");
        nacimiento = sc.nextInt();
        sc.nextLine();
        Empleado hora = new EmpleadoPorHora(nombre, salario, horasTrabajadas, nacimiento);
        hora.Departamento();
        System.out.println("Su salario es " + hora.calcularSalario());
        System.out.println("Edad: " + hora.calcularEdad(aActual));

        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa su año de nacimientos");
        nacimiento = sc.nextInt();
        sc.nextLine();
        Empleado asa = new EmpleadoAsalariado(nombre, salarioA, nacimiento);
        asa.Departamento();
        System.out.println("Su salario es " + asa.calcularSalario());
        System.out.println("Edad: " + asa.calcularEdad(aActual));

        /* --Objeto de tipo empleado--
         * System.out.println("Ingresa tu nombre");
         * nombre=sc.nextLine();
         * System.out.println("Ingresa su año de nacimiento");
         * nacimiento=sc.nextInt(); sc.nextLine();
         * Empleado emp = new Empleado( nombre, salario, nacimiento);
         * emp.Departamento();
         * System.out.println("Su salario es" + emp.calcularSalario());
         * System.out.println("Edad: " + emp.calcularEdad(aActual));
         */
    }

}
