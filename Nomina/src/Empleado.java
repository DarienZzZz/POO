public abstract class Empleado {
    String nombre;
    double salario;
    int nacimiento;

    public Empleado(String nombre, double salario,  int nacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.nacimiento=nacimiento;
    }

    abstract double calcularSalario();
    abstract String Departamento();
    public int calcularEdad(int aActual){
        return aActual=2024-nacimiento;
    }
}
