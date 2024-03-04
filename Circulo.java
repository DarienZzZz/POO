
package com.mycompany.geometria;

public class Circulo extends FiguraGeometrica{
    float radio;

    public Circulo(float radio, int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamBorde, colorBorde, colorRelleno);
        this.radio = radio;
    }
    
    public void dibujar(){
    System.out.println("");
    }
}