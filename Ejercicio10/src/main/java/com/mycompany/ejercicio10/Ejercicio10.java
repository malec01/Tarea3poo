
package com.mycompany.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Scanner nombre = new Scanner(System.in);
        Scanner patrimonio = new Scanner(System.in);
        Scanner estrato = new Scanner(System.in);
        
        
        int num;
        String nom;
        double pat;
        int est;
        
        System.out.println("Digite su número de inscripción ");
        num = numero.nextInt();
        
        System.out.println("Digite su nombre: ");
        nom = nombre.nextLine();
        
        System.out.println("Digite el valor de su patrimonio ");
        pat = patrimonio.nextDouble();
        
        System.out.println("¿Cuál es su estrato?");
        est = estrato.nextInt();
        
        double matricula;
        double valor;
        matricula = 50000;
        
        if (pat > 2000000 && est > 3) {
            valor = matricula + 0.03*pat;
            System.out.println("El estudiante con código "+num+ "y nombre "+nom+"debe pagar"+valor);
            
        }
        else {
            System.out.println("El estudiante con código "+num+ " y nombre " +nom+"debe pagar "+matricula);
        }
        
        
        
        
                }
    

    
}
