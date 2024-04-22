public class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, String DeptPertenece, double salario) {
        super(nombre, DeptPertenece, salario);
    }

    double calcularSalario() {
        return salario = 20000.00 - (20000.00 * 0.32);
    }

    String Departamento(){
        return "Trabajador Asalariado";
    }
}