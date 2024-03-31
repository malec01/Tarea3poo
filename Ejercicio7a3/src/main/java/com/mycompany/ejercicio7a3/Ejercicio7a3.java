
package com.mycompany.ejercicio7a3;

import java.util.Scanner;

public class Ejercicio7a3 {


    public static void main(String[] args) {
        //Asignando valores a A y B
        Scanner dato1 = new Scanner(System.in);
        double a;
        System.out.println("Digite el valor de A: ");
        a = dato1.nextDouble();
        
        Scanner dato2 = new Scanner(System.in);
        double b;
        System.out.println("Digite el valor de B: ");
        b = dato2.nextDouble();
        
        if (a>b) {
            System.out.println("A es mayor que B");
        }
        if (a<b) {
            System.out.println("A es menor que B");
        }
        
        else {
            System.out.println("A es igual a B");
        }
        
        
       

    
    }
}
