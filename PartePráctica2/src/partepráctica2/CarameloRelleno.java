
package partepráctica2;

public class CarameloRelleno extends Caramelo {
    
    private String saborRelleno;
    private int cantidad;

    public String getSaborRelleno() {
        return saborRelleno;
    }

    public void setSaborRelleno(String saborRelleno) {
        this.saborRelleno = saborRelleno;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CarameloRelleno(String saborRelleno, int cantidad, String sabor, String color, int codigo, String nombre, float precio, String ingredientes) {
        super(sabor, color, codigo, nombre, precio, ingredientes);
        this.saborRelleno = saborRelleno;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString()+" Sabor del Relleno=" + saborRelleno + " Cantidad=" + cantidad;
    }
    
}
