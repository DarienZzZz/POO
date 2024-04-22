public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String DeptPertenece, double salario, int horasTrabajadas) {
        super(nombre, DeptPertenece, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    double calcularSalario() {
        return salario = 120.00 * horasTrabajadas;
    }

    String Departamento(){
        return "Trabajador por horas";
    }
}
