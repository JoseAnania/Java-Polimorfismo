
package partepráctica4;

import java.util.Scanner;

public class PartePráctica4 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Servicios: ");
        int cantServicios=SC.nextInt();
        
        Servidor S=new Servidor(cantServicios);
        
        for (int i = 0; i < cantServicios; i++) {
            
            System.out.println("Número: ");
            int numero=SC.nextInt();
            System.out.println("Descripción: ");
            String descripcion=SC.next();
            System.out.println("Costo: ");
            float costo=SC.nextInt();
            
            System.out.println("Tipo de Servicio (1: Abogacía / 2: Arquitectura)");
            int tipoServ=SC.nextInt();
            
            if(tipoServ==1)
            {
                System.out.println("Categoría: (1: Judicial / 2: Laboral / 3: Comercial)");
                int categoria=SC.nextInt();
                System.out.println("Estado: (1: Expediente / 2: Juicio)");
                int estado=SC.nextInt();
                
                S.agregarServicio(new Abogacia(categoria, estado, numero, descripcion, costo));
            }
            
            if(tipoServ==2)
            {
                System.out.println("Tipo: (1: Asesoramiento / 2: Planos)");
                int tipo=SC.nextInt();
                
                S.agregarServicio(new Arquitectura(tipo, numero, descripcion, costo));
            }
        }
        
        System.out.println("Listado de Servicios: "+S.toString());
        
        System.out.println("Total de costo del Servicio de Abogacia: "+S.totalAbogacia());
    }
    
}
