
package partepráctica1;

public class VentaEfectivo extends Venta {
    
    private int porcentaje;

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public VentaEfectivo(int porcentaje, int nroComprobante, String fecha, String cliente, float importeBruto) {
        super(nroComprobante, fecha, cliente, importeBruto);
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return super.toString()+" Porcentaje=" + porcentaje+" Importe de Venta="+calcularImporte();
    }
    
    @Override
    public float calcularImporte()
    {
        float importe=0;
        
        importe=importeBruto-(importeBruto*porcentaje/100);
        
        return importe;
    }
}
