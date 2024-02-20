/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlcelular;
import java.util.Scanner;
/**
 *
 * @author SALA PAFP 28
 */
public class ControlCelular {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int eleccion=0;
        Celular cons=null; //declara un objeto vacio(null)
        String marca, dueno;
    double precio;
    do{
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Construir un celular");
        System.out.println("2. Habilitar celular");
        System.out.println("3. Mostrar datos del celular celular");
        System.out.println("4. Salir");
        eleccion = sc.nextInt();
        
        
        switch(eleccion){
            case 1:
                System.out.println("Ingrese marca: ");
                marca=sc.nextLine();
                System.out.println("Ingrese el precio: ");
                precio=sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el dueño: ");
                dueno=sc.nextLine();
                
                cons= new Celular(marca,  dueno,  precio);
                break;
            case 2:
                if(cons!=null){
                cons.Habilitar();
                }
                break;
            case 3:
                if(cons!=null){
                cons.mostrardatos();
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
