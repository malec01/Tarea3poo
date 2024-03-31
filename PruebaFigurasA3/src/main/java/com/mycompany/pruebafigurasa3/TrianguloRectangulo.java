
package com.mycompany.pruebafigurasa3;

public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double CalcularArea(){
        return base*(altura/2);
    } 
    double CalcularHipotenusa() { 
        return Math.pow(base*base + altura*altura, 0.5);
    }
   double CalcularPerimetro() {
       return base+altura+CalcularHipotenusa();
   } 
   
   
   void determinarTipoTriángulo() {
       if (altura == base && base == CalcularHipotenusa())
           System.out.println("El triángulo es equilátero");
       else if (base != altura && altura != CalcularHipotenusa() && base != CalcularHipotenusa())
           System.out.println("El triágnulo es escaleno");
       else {
           System.out.println("El triángulo es isóceles");
       }
       
   }
   
      
    
}
