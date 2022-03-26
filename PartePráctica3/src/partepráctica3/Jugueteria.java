
package partepráctica3;

public class Jugueteria {
    
    private Juguete[]juguetes;

    public Jugueteria(int cantJuguetes) {
        this.juguetes = new Juguete[cantJuguetes];
    }
    
    public void agregarJuguete(Juguete nuevoJuguete)
    {
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i]==null)
            {
                juguetes[i]=nuevoJuguete;
                break;
            }
        }
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < juguetes.length; i++) {
            
            listado+=juguetes[i].toString()+"\n";
            
        }
        return listado;
    }
    
    public String pelucheCaro()
    {
        float mayor=0;
        String datosMayor="";
        
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] instanceof Peluche)
            {
                if(juguetes[i].calcularPrecio()>mayor)
                {
                    mayor=juguetes[i].calcularPrecio();
                    datosMayor=juguetes[i].toString();
                }
            }
            
        }
        return datosMayor;
    }
    
    public String compararJuguetes()
    {
        int contPN=0;
        int contRI=0;
        String resultado="";
        
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] instanceof Peluche)
            {
                if(juguetes[i].getOrigen()==1)
                {
                    contPN++;
                }
            }
            if(juguetes[i] instanceof Rompecabezas)
            {
                if(juguetes[i].getOrigen()==2)
                {
                    contRI++;
                }
            }         
        }
        if(contPN>contRI)
        {
            resultado+="Existen más Peluches Nacionales que Rompecabezas Importados";
        }
        if(contPN<contRI)
        {
            resultado+="Existen menos Peluches Nacionales que Rompecabezas Importados";
        }
        if(contPN==contRI)
        {
            resultado+="Existen igual cantidad de Peluches Nacionales que Rompecabezas Importados";
        }
        return resultado;
    }
    
}
