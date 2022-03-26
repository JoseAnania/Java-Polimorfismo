
package partepráctica5;

public class Circulo extends Figura{
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(float radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Radio=" + radio +" Perímetro="+calcularPerimetro()+ " Superficie="+calcularSuperficie();
    }
    
    @Override
    public double calcularPerimetro()
    {
        double perimetro=0;
        
        perimetro=2*3.14*radio;
        
        return perimetro;
    }
    
    @Override
    public double calcularSuperficie()
    {
        double superficie=0;
        
        superficie=3.14*(radio*radio);
        
        return superficie;
    }
}
