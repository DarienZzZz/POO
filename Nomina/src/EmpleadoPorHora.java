public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salario, int horasTrabajadas,  int nacimiento) {
        super(nombre, salario, nacimiento);
        this.horasTrabajadas = horasTrabajadas;
    }

    double calcularSalario() {
        return salario = 120.00 * horasTrabajadas;
    }

    String Departamento(){
        return "Trabajador por horas";
    }
}
