
package partepráctica3;

public abstract class Juguete {
    
    private String nombre;
    protected int origen;
    private int edad;
    protected int tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Juguete(String nombre, int origen, int edad, int tipo) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " Origen=" + origen + " Edad=" + edad + " Tipo=" + tipo;
    }
    
    public abstract float calcularPrecio();
    
}
