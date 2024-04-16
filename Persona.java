public abstract class Persona {
    String nombre, dom;
    int edad;

    public Persona(String nombre, String dom, int edad) {
        this.nombre = nombre;
        this.dom = dom;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dom=" + dom + ", edad=" + edad + "]";
    }
}
