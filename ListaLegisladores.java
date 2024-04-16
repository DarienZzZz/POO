import java.util.ArrayList;

public class ListaLegisladores {
    ArrayList<Legislador> listaLegisladores;

    public ListaLegisladores() {
        this.listaLegisladores = new ArrayList();
    }

    void agregarLegislador(Legislador leg) {
        listaLegisladores.add(leg);
    }

    void mostrarLegislador() {
        for (int i = 0; i < listaLegisladores.size(); i++) {
            Legislador legis = listaLegisladores.get(i);
            
            if (legis instanceof Senador){
                //Se realiza un cambio de CuentaBancaria a CuentaDebito la variable cuenta, usando el "CASTING"
                Senador senador=(Senador)legis;
                System.out.println(legis.toString());
                System.out.println();
            }else{
                Diputado dip = (Diputado)legis;
                 System.out.println(dip.toString());
                 System.err.println();
            }
        }
    }
}
