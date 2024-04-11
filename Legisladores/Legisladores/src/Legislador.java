public abstract class Legislador extends Persona {
    String provinciaRep;

    public Legislador(String nombre, String dom, int edad, String provincia) {
        super(nombre, dom, edad);
        this.provinciaRep = provincia;
    }

    @Override
    public String toString() {
        return super.toString() + "Legislador [ provincia que representa=" + provinciaRep + "]";
    }

    abstract String getCamaraTrabajo();

}
