
package partepráctica4;

public abstract class Servicio {
    
    private int numero;
    private String descripcion;
    protected float costo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Servicio(int numero, String descripcion, float costo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Número=" + numero + " Descripcion=" + descripcion + " Costo=" + costo;
    }
    
    public abstract float calcularCosto();
    
}
