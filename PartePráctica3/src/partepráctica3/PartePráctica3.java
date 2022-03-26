
package partepráctica3;

import java.util.Scanner;

public class PartePráctica3 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Juguetes: ");
        int cantJuguetes=SC.nextInt();
        
        Jugueteria J=new Jugueteria(cantJuguetes);
        
        for (int i = 0; i < cantJuguetes; i++) {
            
            System.out.println("Nombre del Juguete: ");
            String nombre=SC.next();
            System.out.println("Origen: (1: Nacional / 2: Importado)");
            int origen=SC.nextInt();
            System.out.println("Edad Recomendada: (1: 2 a 4 años / 2: 5 a 9 años / 3: 10 años en adelante)");
            int edad=SC.nextInt();
            System.out.println("Tipo de Juguete: (1: Peluche / 2: Rompecabezas)");
            int tipo=SC.nextInt();
            
            if(tipo==1)
            {
                System.out.println("Tamaño del Peluche: (1: Chico / 2: Mediano / 3: Grande)");
                int tamanio=SC.nextInt();
                System.out.println("Novedad: (1: Si / 2: No)");
                int novedad=SC.nextInt();
                
                J.agregarJuguete(new Peluche(tamanio, novedad, nombre, origen, edad, tipo));
            }
            
            if(tipo==2)
            {
                System.out.println("Cantidad de Piezas: (1: 500 / 2: 1000 / 3: 3000)");
                int cantPiezas=SC.nextInt();
                
                J.agregarJuguete(new Rompecabezas(cantPiezas, nombre, origen, edad, tipo));
                
            }
        }
        System.out.println("Listado de Juguetes: "+J.toString());
        
        System.out.println("Datos del Peluche más caro: "+J.pelucheCaro());
        
        System.out.println(J.compararJuguetes());
    }
    
}
