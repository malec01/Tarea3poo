
package com.mycompany.ejercicio23a3;

import java.util.Scanner;

public class Ejercicio23A3 {

    public static void main(String[] args) {
        Scanner parametro1 = new Scanner(System.in);
        Scanner parametro2 = new Scanner(System.in);
        Scanner parametro3 = new Scanner(System.in);
        
        
        double A;
        double B;
        double C;
        
        A = parametro1.nextDouble();
        B = parametro2.nextDouble();
        C = parametro3.nextDouble();
        
        System.out.println("Lleve la ecuación a la forma Ax^2 + Bx + C=0. También recuerde que A debe ser diferente de 0 para que la ecuación sea de segundo grado");
        
        
        if (C == 0) { 
            double x;
            x = -B/A;
            System.out.println("Al resolver la ecuación por el método de factor común se obtiene X=0 o X="+x);
        }
        if (C != 0 && (Math.pow(B,2)-4*A*C)>0) {
            
            double x1;
            double x2;
            
            x1 = (-B + Math.sqrt(Math.pow(B,2) - 4*A*C))/2*A;
            x2 = (-B - Math.sqrt(Math.pow(B,2) - 4*A*C))/2*A;
            
            System.out.println("Al resolver la ecucación usando la fórmula del estudiante se obtiene que X="+x1+"o X="+x2);
            
        }
        else {
            System.out.println("La ecucación no tiene soluciones reales");
        }
    }
}
