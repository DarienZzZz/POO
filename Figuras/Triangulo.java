package com.mycompany.geometria;
import java.lang.Math;
public class Triangulo extends FiguraGeometrica{
    float base, altura;

    public Triangulo(float base, float altura, int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamBorde, colorBorde, colorRelleno);
        this.base = base;
        this.altura = altura;
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
        double pita;
        pita=(base)+(2*Math.sqrt(Math.pow((base/2),2)+ Math.pow(altura,2)));
        return pita;
    }
    
}
