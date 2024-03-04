package com.mycompany.geometria;
import java.lang.Math;
public class Triangulo extends FiguraGeometrica{
    float base, altura;
    public Triangulo(int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamBorde, colorBorde, colorRelleno);
    }

    @Override
    public String toString() {
        return super.toString() +"Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
     public void dibujar(){
    System.out.println("Dibujando...");
    }
    
    double calArea(){
        double area;
        area=(base*altura)/2;
        return area;
    }
    
    double calPeri(){
        double perimetro;
        double pita;
        pita=MMath.pow(base,(2));
        perimetro=base*3;
        return perimetro;
    }
    
}
