/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redsocial;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SALA PAFP 28
 */
public class RedSocial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int eleccion=0;
        Publicacion cons=null; //declara un objeto vacio(null)
        String autor, contenido;
        int likes;
        Date fecha;
    do{
        System.out.println("¿Que desea hacer?");
        System.out.println("1. ¿Hacer una nueva publicacion?");
        System.out.println("2. Dar like");
        System.out.println("3. Mostrar la publicacion");
        System.out.println("4. Salir");
        eleccion = sc.nextInt();
        
        
        switch(eleccion){
            case 1:
                System.out.println("Ingrese el autor: ");
                autor=sc.nextLine();
                autor=sc.nextLine();
                System.out.println("Ingrese el contenido de la publicacion: ");
                contenido=sc.nextLine();
                
                cons= new Publicacion(autor,  contenido);
                break;
            case 2:
                if(cons!=null){
                cons.DarLike();
                }
                break;
            case 3:
                if(cons!=null){
                    System.out.println( cons.toString());
                            
                }
                break;
            case 4:
                System.out.println("Adios");
                break;
            default:System.out.println("OPCION NO VALIDA");
                
        }
    }while(eleccion!=4);
    }
}
