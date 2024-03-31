
package com.mycompany.pruebafigurasa3;

public class PruebaFigurasA3 {

    public static void main(String[] args) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    
    System.out.println("El área del círculo es "+ figura1.CalcularArea());
    System.out.println("El perímetro del círculo es "+figura1.CalcularPerimetro());
    
    System.out.println("El área del rectángulo es "+figura2.CalcularArea());
    System.out.println("El perímetro del rectángulo es "+figura2.CalcularPerimetro());
    
    System.out.println("El área del cuadrado es "+figura3.CalcularArea());
    System.out.println("El perímetro del cuadrado es "+figura3.CalcularPerimetro());
    
    System.out.println("El área del triángulo es "+figura4.CalcularArea());
    System.out.println("El perímetro del triángulo es "+figura4.CalcularPerimetro());
    figura4.determinarTipoTriángulo();
    
    }
}
