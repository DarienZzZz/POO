/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SALA PAFP 28
 */
public class RedSocial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();
        int eleccion=0;
        Publicacion cons=null; //declara un objeto vacio(null)
        String autor, contenido;
        int likes;
        Date fecha;
        
        
        //Publicacion nuevaPublicacion;
    do{
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Crear una nueva publicación");
        System.out.println("2. Mostrar todas las publicaciones");
        System.out.println("3. Dar like a una publicación");
        System.out.println("4. Agregar comentario a una publicación");
        System.out.println("5. Salir");
        eleccion = sc.nextInt();
        
        
        switch(eleccion){
            case 1:
                System.out.println("Ingrese el autor: ");
                autor=sc.nextLine();
                autor=sc.nextLine();
                System.out.println("Ingrese el contenido de la publicacion: ");
                contenido=sc.nextLine();
                
                cons= new Publicacion(autor,  contenido);
                listaPublicaciones.add(cons);
                break;
            case 2:
                 if(cons!=null){
                    System.out.println( cons.toString());
                     System.out.println(listaPublicaciones);
                }
                break;
            case 3:
                if(cons!=null){
                    System.out.print("Ingresa el número de la publicación a la que deseas dar like: ");
                    int numPublicacion = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea pendiente
                    cons.DarLike();
                    if (numPublicacion >= 1 && numPublicacion <= listaPublicaciones.size()) {
                    // se le resta 1 al número de publicación porque los arreglos inician en
                    // la posición 0,se obtiene la publicación de la lista
                    Publicacion publicacion = listaPublicaciones.get(numPublicacion - 1);
                    publicacion.DarLike();
                    } else {
                    System.out.println("Número de publicación inválido.");
                    }
                }
                break;
            case 4:
              
                break;
            case 5:
                System.out.println("Adios");
                break;
            default:System.out.println("OPCION NO VALIDA");
                
        }
    }while(eleccion!=5);
    }
}
