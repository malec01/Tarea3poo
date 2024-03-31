
package com.mycompany.ejercicio18a3;

public class Empleado {
    //Atributos
    int code;
    String nombres;
    double horas_trabajadas;
    double valor_hora;
    double porcentaje;
    double salario_neto;
    double salario_bruto;
    
    //Método para calcular el salario bruto y el salario neto
    
    public double SalarioB (){
        salario_bruto = horas_trabajadas*valor_hora;
        return salario_bruto;
    }
    public double SalarioN (){
        salario_neto = salario_bruto-((porcentaje/100)*salario_bruto);
        return salario_neto;
    }
    
    //Constructor

    public Empleado(int code, String nombres, double horas_trabajadas, double valor_hora, double porcentaje) {
        this.code= code;
        this.nombres = nombres;
        this.horas_trabajadas = horas_trabajadas;
        this.valor_hora = valor_hora;
        this.porcentaje = porcentaje;
    }
    
    public int getCode() {
        return code;
    }
    public String getNombres() {
        return nombres;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
    
        
    
        
        
    }
    
    
    

