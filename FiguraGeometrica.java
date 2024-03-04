package com.mycompany.geometria;

public class FiguraGeometrica {
    int puntoX,puntoY, tamBorde;
     String colorBorde, colorRelleno;
//Cntructor
    public FiguraGeometrica(int puntoX, int puntoY, int tamBorde, String colorBorde, String colorRelleno) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
        this.tamBorde = tamBorde;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }
//Get y set
    public int getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }

    public int getTamBorde() {
        return tamBorde;
    }

    public void setTamBorde(int tamBorde) {
        this.tamBorde = tamBorde;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{ " + "puntoX=" + puntoX + ", puntoY=" + puntoY + ", tamBorde=" + tamBorde + ", colorBorde=" + colorBorde + ", colorRelleno=" + colorRelleno + '}';
    }
    
    
}
