
package partepráctica5;

import java.util.Scanner;

public class PartePráctica5 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Figuras: ");
        int cantFiguras=SC.nextInt();
        
        Geometria G=new Geometria(cantFiguras);
        
        for (int i = 0; i < cantFiguras; i++) {
            
            System.out.println("Nombre de la Figura: ");
            String nombre=SC.next();
            
            System.out.println("Tipo de Figura(1: Triángulo / 2: Círculo)");
            int tipoFigura=SC.nextInt();
            
            if(tipoFigura==1)
            {
                System.out.println("Lado 1: ");
                int lado1=SC.nextInt();
                System.out.println("Lado 2: ");
                int lado2=SC.nextInt();
                System.out.println("Lado3: ");
                int lado3=SC.nextInt();
                
                G.agregarFigura(new Triangulo(lado1, lado2, lado3, nombre));
            }
            
            if(tipoFigura==2)
            {
                System.out.println("Radio: ");
                float radio=SC.nextFloat();
                
                G.agregarFigura(new Circulo(radio, nombre));
            }
        }
        System.out.println("Listado: "+G.toString());
        
        System.out.println("Valor acumulado de la superficie de todas las figuras: "+G.totalSuperficie());
        
        System.out.println("Nombre del Triángulo con mayor Perímetro: "+G.trianguloMayorPerimetro());
    }
    
}
