/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redsocial;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author SALA PAFP 28
 */
public class Publicacion {
   

    String autor, contenido;
    int likes;
    Date fecha;
    ArrayList<Comentario> comentarios;

    public Publicacion(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.likes =0;
        this.fecha = new Date();
        this.comentarios = new ArrayList<Comentario>();
    }

    @Override
    public String toString() {
        return "Publicacion{" + "autor=" + autor + ", contenido=" + contenido + ", likes=" + likes + ", fecha=" + fecha + '}';
    }
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    void DarLike(){
        likes += 1;
    }
    //metodos practica 3
    public void agregarComentario(Comentario comentario){
       comentarios.add (comentario);
    }
    public void mostrarComentarios(){
        for (int i = 0; i < comentarios.size(); i++) {
            Comentario comentario = comentarios.get(i);
            System.out.println((i + 1) + ". Usuario " + comentario.getNombreUsuario() );
            System.out.println("Comentario " + comentario.getTextoComentario() );
            System.out.println("Fecha del comentario " + comentario.getFechadelComentario() );
        }
        

    }
  
}
