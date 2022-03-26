
package partepráctica3;

public class Rompecabezas extends Juguete {
    
    private int cantPiezas;

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    public Rompecabezas(int cantPiezas, String nombre, int origen, int edad, int tipo) {
        super(nombre, origen, edad, tipo);
        this.cantPiezas = cantPiezas;
    }

    @Override
    public String toString() {
        return super.toString() + " Cantidad de Piezas=" + cantPiezas+ " Precio="+calcularPrecio();
    }
    
    @Override
    public float calcularPrecio()
    {
        float precio=0;
        
        if(cantPiezas==1 && origen==1)
        {
            precio=40.50f;
        }
        if(cantPiezas==1 && origen==2)
        {
            precio=115.50f;
        }
        if(cantPiezas==2 && origen==1)
        {
            precio=65f;
        }
        if(cantPiezas==2 && origen==2)
        {
            precio=140f;
        }
        if(cantPiezas==3 && origen==1)
        {
            precio=74.90f;
        }
        if(cantPiezas==3 && origen==2)
        {
            precio=149.90F;
        }
        return precio;
    }
}
