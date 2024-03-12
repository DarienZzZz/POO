public class ProductoRefrigerado extends Producto{
    String LAFDSMLFR;

    public ProductoRefrigerado(String fCaducidad, int numLote, String lAFDSMLFR) {
        super(fCaducidad, numLote);
        LAFDSMLFR = lAFDSMLFR;
    }

    public String getLAFDSMLFR() {
        return LAFDSMLFR;
    }

    public void setLAFDSMLFR(String lAFDSMLFR) {
        LAFDSMLFR = lAFDSMLFR;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado [LAFDSMLFR=" + LAFDSMLFR + "]";
    }
    
}
