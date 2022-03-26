
package partepráctica2;

public class Caramelo extends Golosina{
    
    private String sabor;
    private String color;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Caramelo(String sabor, String color, int codigo, String nombre, float precio, String ingredientes) {
        super(codigo, nombre, precio, ingredientes);
        this.sabor = sabor;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ " Sabor=" + sabor + " Color=" + color;
    }
    
}
