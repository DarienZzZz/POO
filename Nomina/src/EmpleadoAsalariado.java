public class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, double salario, int nacimiento) {
        super(nombre, salario, nacimiento);
    }

    double calcularSalario() {
        return salario = 20000.00 - (20000.00 * 0.32);
        
    }

    String Departamento(){
        return "Trabajador Asalariado";
    }
    
}