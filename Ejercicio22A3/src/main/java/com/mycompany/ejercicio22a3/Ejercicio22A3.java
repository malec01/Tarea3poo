
package com.mycompany.ejercicio22a3;

import java.util.Scanner;

public class Ejercicio22A3 {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner salariob = new Scanner(System.in);
        Scanner horast = new Scanner(System.in);
        
        String nom;
        double sb;
        int horas_mes;
        
        System.out.println("Indique su nombre: ");
        nom = nombre.nextLine();
        
        System.out.println("Indique de cuánto es su salario base por hora ");
        sb = salariob.nextDouble();
        
        System.out.println("Indique la cantidad de horas trabajadas en el mes");
        horas_mes = horast.nextInt();
        
        
        double salario;
        salario = sb*horas_mes;
        
        if (salario > 450000) {
            System.out.println("Su nombre es "+nom+" y su salario es "+salario);
        }
        else {
            System.out.println("Su nombre es "+nom);
        }
        
        

    }
}
