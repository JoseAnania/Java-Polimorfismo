
package práctico1;

public class Obrero extends Empleado {
    
    private int diasTrab;

    public int getDiasTrab() {
        return diasTrab;
    }

    public void setDiasTrab(int diasTrab) {
        this.diasTrab = diasTrab;
    }

    public Obrero(int diasTrab, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrab = diasTrab;
    }

    @Override
    public String toString() {
        return super.toString()+" Dias Trabajados=" + diasTrab + " Sueldo Neto=" + calcularSueldo();
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        sueldo=diasTrab*(sueldoBasico/22);
        
        return sueldo;
    }
}
