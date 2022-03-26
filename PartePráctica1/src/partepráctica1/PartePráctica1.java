
package partepráctica1;

import java.util.Scanner;

public class PartePráctica1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Ventas: ");
        int cantVentas=SC.nextInt();
        
        Comercio C=new Comercio(cantVentas);
        
        for (int i = 0; i < cantVentas; i++) {
            
            System.out.println("Nº de comprobante: ");
            int nroComprobante=SC.nextInt();
            System.out.println("Fecha de Venta: ");
            String fecha=SC.next();
            System.out.println("Nombre del Cliente: ");
            String nombre=SC.next();
            System.out.println("Importe Bruto: ");
            float importeBruto=SC.nextFloat();
            
            System.out.println("Tipo de Venta: (1: Efectivo / 2: Tarjeta)");
            int tipoVenta=SC.nextInt();
            
            if(tipoVenta==1)
            {
                System.out.println("Porcentaje de descuento: ");
                int porcentaje=SC.nextInt();
                
                C.agregarVenta(new VentaEfectivo(porcentaje, nroComprobante, fecha, nombre, importeBruto));
            }
            
            if(tipoVenta==2)
            {
                System.out.println("Tarjeta: (1: Visa / 2: Naranja / 3: Otra)");
                int tarjeta=SC.nextInt();
                
                C.agregarVenta(new VentaTarjeta(tarjeta, nroComprobante, fecha, nombre, importeBruto));
            }
        }
        System.out.println("Listado de Ventas: "+C.toString());
        
        System.out.println("Cantidad de Ventas en Efectivo: "+C.cantVentasTipo(1));
        System.out.println("Cantidad de Ventas con Tarjeta: "+C.cantVentasTipo(2));
        
        System.out.println("Monto Total de Ventas en Efectivo: "+C.montoVentasTipo(1));
        System.out.println("Monto Total de Ventas con Tarjeta: "+C.montoVentasTipo(2));
        
        System.out.println("Monto Total de Ventas: "+C.montoTotal());
    }
    
}
