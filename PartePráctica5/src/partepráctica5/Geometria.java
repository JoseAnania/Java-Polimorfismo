
package partepráctica5;

public class Geometria {
    
    private Figura[]figuras;

    public Geometria(int cantFiguras) {
        this.figuras = new Figura[cantFiguras];
    }
    
    public void agregarFigura(Figura nuevaFigura)
    {
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i]==null)
            {
                figuras[i]=nuevaFigura;
                break;
            }           
        }
    }

    @Override
    public String toString() {
        String listado="\n";
        
        for (int i = 0; i < figuras.length; i++) {
            
            listado+=figuras[i].toString()+"\n";
        }
        return listado;
    }
    
    public double totalSuperficie()
    {
        double superficieTotal=0;
        
        for (int i = 0; i < figuras.length; i++) {
            
            superficieTotal+=figuras[i].calcularSuperficie();
            
        }
        return superficieTotal;
    }
    
    public String trianguloMayorPerimetro()
    {
        double mayor=0;
        String nomMayor="";
        
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Triangulo)
            {
                if(figuras[i].calcularPerimetro()>mayor)
                {
                    mayor=figuras[i].calcularPerimetro();
                    nomMayor=figuras[i].getNombre();
                }
            }
        }
        return nomMayor;
    }
    
}
