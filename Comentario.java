/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redsocial;
import java.util.Date;

/**
 *
 * @author SALA PAFP 28
 */
public class Comentario {
    String nombreUsuario;
    String textoComentario;
    Date fechadelComentario;

    public Comentario(String nombreUsuario, String textoComentario, Date fechadelComentario) {
        this.nombreUsuario = nombreUsuario;
        this.textoComentario = textoComentario;
        this.fechadelComentario = new Date();
        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public Date getFechadelComentario() {
        return fechadelComentario;
    }

    public void setFechadelComentario(Date fechadelComentario) {
        this.fechadelComentario = fechadelComentario;
    }

    

}
