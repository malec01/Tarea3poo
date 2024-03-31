
package com.mycompany.ejercicio19a3;

import java.util.Scanner;

public class Ejercicio19a3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado;
        // Pedir el valor del lado del triángulo
        System.out.print("Digite la medida del lado del triángulo: ");
        lado = entrada.nextDouble();
        
       //Calcular perímetro
       double perimetro;
       perimetro = 3*lado;
       System.out.println("El perímetro es: " + perimetro);
       
       //Calcular altura
       double altura;
       altura = Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2));
       System.out.println("La altura es: " + altura);
       
       //Calcular área
       double area;
       area = (lado*altura)/2;
       System.out.println("El área es: " + area);
       
       
       
       
       
       
       
       
       
        
        
        
        
    }
        
        
    
        
    
}
