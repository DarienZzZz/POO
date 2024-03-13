public class Producto {
    
    String fCaducidad;
    int numLote;

    public Producto(String fCaducidad, int numLote) {
        this.fCaducidad = fCaducidad;
        this.numLote = numLote;
    }
    public String getfCaducidad() {
        return fCaducidad;
    }
    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }
    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
    @Override
    public String toString() {
        return "Producto [fCaducidad=" + fCaducidad + ", numLote=" + numLote + "]";
    }
    
}
