/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlcelular;

/**
 *
 * @author SALA PAFP 28
 */
public class Celular {
    String marca, dueño;
    double precio;
    boolean estado;

    public Celular(String marca, String dueño, double precio) {
        this.marca = marca;
        this.dueño = dueño;
        this.precio = precio;
        this.estado =false;
        
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    public String mostrardatos() {
        String idk;
        if(estadoHabilitado()){
            idk="Habilitado";
            
        }
        else{
            idk="Deshabilitado";
        }
        return "Celular{" + "marca=" + marca + ", due\u00f1o=" + dueño + ", precio=" + precio + ", estado=" + idk + '}';
    }
    
    public void Habilitar(){
       estado = true;
    }
    
    public boolean estadoHabilitado(){
        return estado;
    }
    
    
    
}
