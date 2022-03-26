
package práctico1;

import java.util.Scanner;

public class Práctico1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Empleados: ");
        int cantEmpleados=SC.nextInt();
        
        Empresa EM=new Empresa(cantEmpleados);
        
        for (int i = 0; i < cantEmpleados; i++) {
            
            System.out.println("Legajo: ");
            int legajo=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Sueldo Básico: ");
            float sueldoBasico=SC.nextFloat();
            
            System.out.println("Ingrese tipo de Empleado (0: Obrero / 1: Administrativo / 2: Vendedor)");
            int tipoEmpleado=SC.nextInt();
            
            if(tipoEmpleado==0)
            {
                System.out.println("Cantidad de días Trabajados: ");
                int diasTrab=SC.nextInt();
                
                EM.agregarEmpleado(new Obrero(diasTrab, legajo, nombre, sueldoBasico));
            }
                        
            if(tipoEmpleado==1)
            {
                System.out.println("Presentismo: (0: Si / 1: No)");
                int pres=SC.nextInt();
                boolean presentismo=false;
                if(pres==0)
                {
                    presentismo=true;
                }
               
                EM.agregarEmpleado(new Administrativo(presentismo, legajo, nombre, sueldoBasico));
            }
            
            if (tipoEmpleado==2)
            {
                System.out.println("Total de Ventas: ");
                float totalVentas=SC.nextFloat();
                
                EM.agregarEmpleado(new Vendedor(totalVentas, legajo, nombre, sueldoBasico));
            }
        }
        
        System.out.println("Listado de Empleados: "+EM.toString());
        
        System.out.println("Total de Sueldo de Obreros: "+EM.totalPorTipo(0));
        System.out.println("Total de Sueldo de Administrativos: "+EM.totalPorTipo(1));
        System.out.println("Total de Sueldo de Vendedor: "+EM.totalPorTipo(2));
        
        System.out.println("Total de Sueldos pagados: "+EM.totalGeneral());
        
    }
    
}
