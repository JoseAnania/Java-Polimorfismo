
package partepráctica4;

public class Arquitectura extends Servicio {
    
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Arquitectura(int tipo, int numero, String descripcion, float costo) {
        super(numero, descripcion, costo);
        this.tipo = tipo;
    }

    public Arquitectura(int numero, String descripcion, float costo) {
        super(numero, descripcion, costo);
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo=" + tipo+ " Costo Servicio="+calcularCosto();
    }
    
    @Override
    public float calcularCosto()
    {
        float costoServicio=0;
        
        if(tipo==1)
        {
            costoServicio=costo;
        }
        if(tipo==2)
        {
            costoServicio=costo+200;
        }
        return costoServicio;
    }
}
