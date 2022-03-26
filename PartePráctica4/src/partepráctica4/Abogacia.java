
package partepráctica4;

public class Abogacia extends Servicio {
    
    private int categoria;
    private int estado;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Abogacia(int categoria, int estado, int numero, String descripcion, float costo) {
        super(numero, descripcion, costo);
        this.categoria = categoria;
        this.estado = estado;
    }

    public Abogacia(int numero, String descripcion, float costo) {
        super(numero, descripcion, costo);
    }

    @Override
    public String toString() {
        return super.toString() + " Categoría=" + categoria + " Estado=" + estado+ " Costo Servicio="+calcularCosto();
    }
    
    @Override
    public float calcularCosto()
    {
        float costoServicio=0;
        
        if(estado==1)
        {
            costoServicio=costo*100;
        }
        if(estado==2)
        {
            costoServicio=costo*200;
        }
        return costoServicio;
    }
    
}
