
package partepráctica1;

public class VentaTarjeta extends Venta {
    
    private int tarjeta;

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public VentaTarjeta(int tarjeta, int nroComprobante, String fecha, String cliente, float importeBruto) {
        super(nroComprobante, fecha, cliente, importeBruto);
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return super.toString()+ " Tarjeta=" + tarjeta+" Importe de Venta="+calcularImporte();
    }
    
    @Override
    public float calcularImporte()
    {
        float importe=0;
        
        if(tarjeta==1)
        {
            importe=importeBruto+(importeBruto*1.5f/100);
        }
        if(tarjeta==2)
        {
            importe=importeBruto+(importeBruto*2.5f/100);
        }
        if(tarjeta==3)
        {
            importe=importeBruto+(importeBruto*5/100);
        }
        return importe;
    }
    
    
}
