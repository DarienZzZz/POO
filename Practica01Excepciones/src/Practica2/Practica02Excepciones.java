package Practica2;

public class Practica02Excepciones {
    public static void main(String[] args) throws Exception {
        
        atrapandoExcepciones();
    }   
    /*Método que lanza una excepción con un mensaje diferente*/
public static int convertir(String dato) throws NumberFormatException{
    int convertido = 0;
    convertido = Integer.parseInt(dato);
    return convertido;
    }
    public static void atrapandoExcepciones(){
        try{
        System.out.println("Convertido: " + convertir("Palabra"));
        }
        catch(NumberFormatException e){
        System.out.println("No puedo realizar la conversión");
        }
        }
}
