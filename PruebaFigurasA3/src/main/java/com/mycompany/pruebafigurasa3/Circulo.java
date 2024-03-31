
package com.mycompany.pruebafigurasa3;

public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    double CalcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    
    double CalcularPerimetro () { 
        return 2*Math.PI*radio;
    }
    
}
