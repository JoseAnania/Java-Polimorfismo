
package partepráctica2;

public class Fabrica {
    
    private Golosina[]golosinas;

    public Fabrica(int cantGolosinas) {
        this.golosinas = new Golosina[cantGolosinas];
    }
    
    public void agregarGolosina(Golosina nuevaGolosina)
    {
        for (int i = 0; i < golosinas.length; i++) {
           if(golosinas[i]==null)
           {
               golosinas[i]=nuevaGolosina;
               break;
           }
            
        }
    }

    @Override
    public String toString() {
        
        String sabores="\n";
        
        for (int i = 0; i < golosinas.length; i++) {
            if(golosinas[i] instanceof CarameloRelleno)
            {
                CarameloRelleno CR=(CarameloRelleno) golosinas[i];
                sabores+=CR.getSaborRelleno()+"\n";
            }
            
        }
        return sabores;
    }
    
    
}
