public class Diputado extends Legislador {

    public Diputado(String nombre, String dom, int edad, String provincia) {
        super(nombre, dom, edad, provincia);
    }
    //override
    String getCamaraTrabajo() {
        return "Trabaja en la camara de Diputados";
    }
}
