import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FicheroTextoPrueba1 {
    public static void main(String[] args) throws Exception {
        String cad; //Declaramos variable para guardar nuestros datos
        try {//Exepcion
            //Creamos un objeto de tipo BufferedReader con la ruta de nuestro archivo
            BufferedReader br = new BufferedReader(new FileReader("D:\\Owner\\Documents\\aPOO\\Codigos\\PESO.txt"));
            while ((cad = br.readLine()) != null) {//Leera las lineas hasta que no haya
                System.out.println(cad);
            }
            br.close();// Cerramos las impresiones
        } catch (IOException ioe) {//Expecion 
            System.out.println(ioe);//Mensaje de error
        }
    }
}
