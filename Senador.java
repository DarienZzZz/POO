public class Senador extends Legislador{

public Senador(String nombre, String dom, int edad, String provincia) {
    super(nombre, dom, edad, provincia);
}
  
String getCamaraTrabajo() {
    return "Trabaja en la camara de Senadores";
}

}
