
package partepráctica4;

public class Servidor {
    
    private Servicio[]servicios;

    public Servidor(int cantServicios) {
        this.servicios = new Servicio[cantServicios];
    }
    
    public void agregarServicio(Servicio nuevoServicio)
    {
        for (int i = 0; i < servicios.length; i++) {
            if(servicios[i]==null)
            {
                servicios[i]=nuevoServicio;
                break;
            }           
        }
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < servicios.length; i++) {
            
            listado+=servicios[i].toString()+"\n";
            
        }
        return listado;
    }
    
    public float totalAbogacia()
    {
        float totalAbogacia=0;
        
        for (int i = 0; i < servicios.length; i++) {
            if(servicios[i] instanceof Abogacia)
            {
                totalAbogacia+=servicios[i].calcularCosto();
            }           
        }
        return totalAbogacia;
    }
    
}
