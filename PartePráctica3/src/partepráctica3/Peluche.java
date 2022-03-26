
package partepráctica3;

public class Peluche extends Juguete {
    
    private int tamanio;
    private int novedad;

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getNovedad() {
        return novedad;
    }

    public void setNovedad(int novedad) {
        this.novedad = novedad;
    }

    public Peluche(int tamanio, int novedad, String nombre, int origen, int edad, int tipo) {
        super(nombre, origen, edad, tipo);
        this.tamanio = tamanio;
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return super.toString() + " Tamaño=" + tamanio + " Novedad=" + novedad+" Precio="+calcularPrecio();
    }
    
    @Override
    public float calcularPrecio()
    {
        float precio=0;
        
        if(tamanio==1 && novedad==1)
        {
            precio=60f;
        }
        if(tamanio==1 && novedad==2)
        {
            precio=10f;
        }
        if(tamanio==2 && novedad==1)
        {
            precio=87.50f;
        }
        if(tamanio==2 && novedad==2)
        {
            precio=37.50f;
        }
        if(tamanio==3 && novedad==1)
        {
            precio=150.90f;
        }
        if(tamanio==3 && novedad==2)
        {
            precio=100.90f;
        }
        return precio;
    }
    
    
}
