public abstract class Empleado {
    String nombre, DeptPertenece;
    double salario;

    public Empleado(String nombre, String DeptPertenece, double salario) {
        this.nombre = nombre;
        DeptPertenece = DeptPertenece;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", DeptPertenece=" + DeptPertenece
                + ", salario=" + salario + "]";
    }

    abstract double calcularSalario();
    abstract String Departamento();
}
