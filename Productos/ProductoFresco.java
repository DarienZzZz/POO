public class ProductoFresco extends Producto{
    String fEnvazado;
    String orginPais;
    public ProductoFresco(String fCaducidad, int numLote, String fEnvazado, String orginPais) {
        super(fCaducidad, numLote);
        this.fEnvazado = fEnvazado;
        this.orginPais = orginPais;
    }
    public String getfEnvazado() {
        return fEnvazado;
    }
    public void setfEnvazado(String fEnvazado) {
        this.fEnvazado = fEnvazado;
    }
    public String getOrginPais() {
        return orginPais;
    }
    public void setOrginPais(String orginPais) {
        this.orginPais = orginPais;
    }
    @Override
    public String toString() {
        return super.toString() +"ProductoFresco [fEnvazado=" + fEnvazado + ", orginPais=" + orginPais + "]";
    }
    
}
