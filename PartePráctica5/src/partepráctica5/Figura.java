
package partepráctica5;

public abstract class Figura {
    
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre;
    }
    
    public abstract double calcularPerimetro();
    
    public abstract double calcularSuperficie();
    
}
