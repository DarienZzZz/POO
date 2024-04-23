public abstract class Empleado {
    String nombre;
    double salario;
    int nacimiento;

    public Empleado(String nombre, double salario,  int nacimiento) {
        this.nombre = nombre;
        this.salario = salario;
    }

    abstract double calcularSalario();
    abstract String Departamento();
  
}
