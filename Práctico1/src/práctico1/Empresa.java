
package práctico1;

public class Empresa {
    private Empleado[]empleados;

    public Empresa(int cantEmpleados) {
        this.empleados = new Empleado[cantEmpleados];
    }
    
    public void agregarEmpleado(Empleado nuevoEmpleado)
    {
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i]==null)
            {
                empleados[i]=nuevoEmpleado;
                break;
            }
        }
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < empleados.length; i++) {
            
            listado+=empleados[i].toString()+"\n";
            
        }
        return listado;
    }
    
    public float totalPorTipo(int tipoEmpleado)
    {
        float total=0;
        
        for (int i = 0; i < empleados.length; i++) {
            
            if(empleados[i] instanceof Obrero)
            {  
                if(tipoEmpleado==0)
                {
                    total+=empleados[i].calcularSueldo();
                }               
            }
            if(empleados[i] instanceof Administrativo)
            {          
                if(tipoEmpleado==1)
                {
                    total+=empleados[i].calcularSueldo();
                }               
            }
            if(empleados[i] instanceof Vendedor)
            {
                if(tipoEmpleado==2)
                total+=empleados[i].calcularSueldo();
            }           
        }
        return total;
    }
    
    public float totalGeneral()
    {
        float totalGeneral=0;
        
        for (int i = 0; i < empleados.length; i++) {
            
            totalGeneral+=empleados[i].calcularSueldo();
            
        }
        return totalGeneral;
    }
    
}
