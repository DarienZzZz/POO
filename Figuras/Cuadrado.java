package com.mycompany.geometria;

public class Cuadrado extends FiguraGeometrica{
    float lado;

    public Cuadrado(float lado, int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamBorde, colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    public void dibujar(){
    System.out.println("Dibujando...");
    }
    
    double calArea(){
        double area;
        area=lado*lado;
        return area;
    }
    
    double calPeri(){
        double perimetro;
        perimetro=lado*4;
        return perimetro;
    }
}
