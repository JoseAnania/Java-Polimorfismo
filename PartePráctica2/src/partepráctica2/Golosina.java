
package partepráctica2;

public abstract class Golosina {
    
    private int codigo;
    private String nombre;
    private float precio;
    private String ingredientes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Golosina(int codigo, String nombre, float precio, String ingredientes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + " Nombre=" + nombre + " Precio=" + precio + " Ingredientes=" + ingredientes;
    }
    
    
}
