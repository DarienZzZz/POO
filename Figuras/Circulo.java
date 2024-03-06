
package com.mycompany.geometria;

public class Circulo extends FiguraGeometrica{
    float radio;
    double pi=3.1416;

    public Circulo(float radio, int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamBorde, colorBorde, colorRelleno);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    
    public void dibujar(){
    System.out.println("Dibujando...");
    }
    
    double calArea(){
        double area;
        area=pi*(radio*radio);
        return area;
    }
    
    double calPeri(){
        double perimetro;
        double diametro=radio*2;
        perimetro=pi*diametro;
        return perimetro;
                
    }
}