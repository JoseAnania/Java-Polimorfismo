
package partepráctica1;

public class Comercio {
    
    private Venta[]ventas;

    public Comercio(int cantVentas) {
        this.ventas = new Venta[cantVentas];
    }
    
    public void agregarVenta(Venta nuevaVenta)
    {
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i]==null)
            {
                ventas[i]=nuevaVenta;
                break;
            }
        }
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < ventas.length; i++) {
            
            listado+=ventas[i].toString()+"\n";
            
        }
        return listado;
    }
    
    public int cantVentasTipo(int tipoVenta)
    {
        int cont=0;
        
        for (int i = 0; i < ventas.length; i++) {
            
            if(ventas[i] instanceof VentaEfectivo)
            {
                if(tipoVenta==1)
                {
                    cont++;
                }
            }
            
            if(ventas[i] instanceof VentaTarjeta)
            {
                if(tipoVenta==2)
                {
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public float montoVentasTipo(int tipoVenta)
    {
        float monto=0;
        
        for (int i = 0; i < ventas.length; i++) {
            
            if(ventas[i] instanceof VentaEfectivo)
            {
                if(tipoVenta==1)
                {
                    monto+=ventas[i].calcularImporte();
                }
            }
            if(ventas[i] instanceof VentaTarjeta)
            {
                if(tipoVenta==2)
                {
                    monto+=ventas[i].calcularImporte();
                }
            }
        }
        return monto;
    }
    
    public float montoTotal()
    {
        float total=0;
        
        for (int i = 0; i < ventas.length; i++) {
            
            total+=ventas[i].calcularImporte();
            
        }
        return total;
    }
    
}
