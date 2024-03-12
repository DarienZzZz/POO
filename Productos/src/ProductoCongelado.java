public class ProductoCongelado extends Producto{
    String tempRecomendada;

    public ProductoCongelado(String fCaducidad, int numLote, String tempRecomendada) {
        super(fCaducidad, numLote);
        this.tempRecomendada = tempRecomendada;
    }

    public String getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(String tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoCongelado [tempRecomendada=" + tempRecomendada + "]";
    }
    
}
