
package partepráctica2;

import java.util.Scanner;

public class PartePráctica2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Golosinas: ");
        int cantGolosinas=SC.nextInt();
        
        Fabrica F=new Fabrica(cantGolosinas);
        
        for (int i = 0; i < cantGolosinas; i++) {
            
            System.out.println("Código de Golosina: ");
            int codigo=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Precio: ");
            float precio=SC.nextFloat();
            System.out.println("Ingredientes: ");
            String ingredientes=SC.next();
            System.out.println("Sabor: ");
            String sabor=SC.next();
            System.out.println("Color: ");
            String color=SC.next();
            
            System.out.println("Tipo: (1: Caramelo / 2: Caramelo Relleno)");
            int tipo=SC.nextInt();
            
            
            if(tipo==1)
            {               
                F.agregarGolosina(new Caramelo(sabor, color, codigo, nombre, precio, ingredientes));
            }
            
            if(tipo==2)
            {
                System.out.println("Sabor del relleno: ");
                String saborRelleno=SC.next();
                System.out.println("Cantidad de relleno: ");
                int cantidad=SC.nextInt();
                
                F.agregarGolosina(new CarameloRelleno(saborRelleno, cantidad, sabor, color, codigo, nombre, precio, ingredientes));
                
            }
        }
        
        System.out.println("Sabores de los Caramelos Rellenos: "+F.toString());        
    }
    
}
