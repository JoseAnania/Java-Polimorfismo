package partepráctica1;

public abstract class Venta {
    
    private int nroComprobante;
    private String fecha;
    private String cliente;
    protected float importeBruto;

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(float importeBruto) {
        this.importeBruto = importeBruto;
    }

    public Venta(int nroComprobante, String fecha, String cliente, float importeBruto) {
        this.nroComprobante = nroComprobante;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeBruto = importeBruto;
    }

    @Override
    public String toString() {
        return "Nº de Comprobante=" + nroComprobante + " Fecha=" + fecha + " Cliente=" + cliente + " Importe Bruto=" + importeBruto;
    }
    
    public abstract float calcularImporte();
    
}
