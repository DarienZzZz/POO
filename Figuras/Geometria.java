//Calcular el area,perimetro y dibujar figura(simulado
//Ciculos, cuadrados y triangulos
package com.mycompany.geometria;
import java.util.Scanner;
public class Geometria {
static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        
        Circulo circulo;
        Cuadrado cuadrado;
        Triangulo triangulo;
        int eleccion;
        
        do{
            System.out.println("Que figura va a utilizar?");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Salir");
            eleccion=sc.nextInt();
            sc.nextLine();
            
            switch(eleccion){
                case 1:
                    circulo= crearCirculo();
                   System.out.println("...Circulo...");
                   System.out.println("Area: " + circulo.calArea());
                   System.out.println("Area: " + circulo.calPeri()); 
                    break;
                case 2:
                    cuadrado= crearCuadrado();
                    System.out.println("...Circulo...");
                    System.out.println("Area: " + cuadrado.calArea());
                   System.out.println("Perimetro: " + cuadrado.calPeri());
                   
                    break;
                case 3:
                    triangulo= crearTriangulo();
                    System.out.println("...Triangulo...");
                    System.out.println("Area: " + triangulo.calArea());
                    System.out.println("Perimetro: " + triangulo.calPeri());
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Bro, hazlo otra vez");
                    
            }
        }while(eleccion!=4);
        }
        public static Circulo crearCirculo(){
            Circulo ci;
             float radio; 
            int puntoX, puntoY, tamBorde;
            String colorBorde, colorRelleno;
            System.out.println("Ingrese el radio");
            radio=sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese el punto X ");
            puntoX=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el punto Y ");
            puntoY=sc.nextInt();
            sc.nextLine();System.out.println("Ingrese el tamaño del borde");
            tamBorde=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Ingrese el color del relleno");
            colorRelleno=sc.nextLine();
            ci=new Circulo(radio,puntoX,puntoY,tamBorde, colorBorde, colorRelleno);
            return ci;
        }
        public static Cuadrado crearCuadrado(){
            Cuadrado cu;
            float lado; 
            int puntoX, puntoY, tamBorde;
            String colorBorde, colorRelleno;
            System.out.println("Ingrese el lado");
            lado=sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese el punto X ");
            puntoX=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el punto Y ");
            puntoY=sc.nextInt();
            sc.nextLine();System.out.println("Ingrese el tamaño del borde");
            tamBorde=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Ingrese el color del relleno");
            colorRelleno=sc.nextLine();
            cu=new Cuadrado(lado,puntoX,puntoY,tamBorde, colorBorde, colorRelleno);
            return cu;
        }
        public static Triangulo crearTriangulo(){
            Triangulo tri;
            float base,altura; 
            int puntoX, puntoY, tamBorde;
            String colorBorde, colorRelleno;
            System.out.println("Ingrese el base");
            base=sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese el altura");
            altura=sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese el punto X ");
            puntoX=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el punto Y ");
            puntoY=sc.nextInt();
            sc.nextLine();System.out.println("Ingrese el tamaño del borde");
            tamBorde=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Ingrese el color del relleno");
            colorRelleno=sc.nextLine();
            tri=new Triangulo(base,altura,puntoX,puntoY,tamBorde, colorBorde, colorRelleno);
            return tri;
        }
}
    

