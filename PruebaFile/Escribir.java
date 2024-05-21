import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Escribir {
    public static void main(String[] args) throws Exception {
        //Declaramos variables con el contenido que queremos escribir
        String cad1 = "Mi primera cadena escrita.";
        String cad2 = "Tal vez en otra vida.\nTal vez en otro día.\nNo sé si todavía.\nOyes mi melodía.";
        try {//Exepcion
            //Crearemos un objeto de tipo BufferedWriter con la ruta de nuestro archivo 
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Owner\\Documents\\aPOO\\Codigos\\PESO.txt"));
            bw.write(cad1); //Se indica la escritura de la primera cadena 
            bw.newLine();//Salto de linea
            bw.write(cad2);//Se indica la escritura de la segunda cadena
            bw.flush();
            // Cerramos el stream
            bw.close();
        } catch (IOException ioe) {//Exepcion
            System.out.println("Error IO: " + ioe.toString());//Mensaje de error
        }
    }
}
