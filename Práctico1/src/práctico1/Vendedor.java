
package práctico1;

public class Vendedor extends Empleado {
    
    private float totalVentas;

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor(float totalVentas, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return super.toString()+ " Total de Ventas=" + totalVentas + " Sueldo Neto="+calcularSueldo();
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        sueldo=totalVentas*0.01f+sueldoBasico;
        
        return sueldo;
    }
    
}
