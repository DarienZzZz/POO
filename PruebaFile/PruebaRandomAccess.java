import java.io.IOException;
import java.io.RandomAccessFile;
public class PruebaRandomAccess {
    public static void main(String[] args) throws Exception {
        //*Try en caso de exepciones
        try {
            //?Creamos un objeto tipo RandomAccessFile donde agregamos el nombre del fichero y el modo de lectura
            RandomAccessFile raf = new RandomAccessFile("FicheroAleatorio.dat", "rw");
            //Le daremos parametros a nuestro fichero
            for (int i = 0; i < 10; i++) {//Numero de archivos
                //En este caso, deremos nuemeros
                raf.writeDouble(i * 2); //Escribimos en tipo Double
            }
            raf.close(); //Cerramos el raf, para que no acepte mas valores
            presenta(); //Llamamos el metodo
            raf = new RandomAccessFile("FicheroAleatorio.dat", "rw");
            raf.seek(5 * 8); // Vamos a la posición 5.
            raf.writeDouble(1.26); //Cambiamos el valor
            raf.close(); //Cerramos la entrada de datos
            presenta(); //Llamamos nuevamente al metodo
        } catch (IOException ioe) { //Si se ingresase un dato de tipo no valido
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {//Error generico
            System.out.println("Error: " + e.getMessage());//Mensaje de error
        }
    }
    //Imprimir los datos
    private static void presenta() throws IOException { //Exepcion en caso de error
        RandomAccessFile raf = new RandomAccessFile("FicheroAleatorio.dat", "rw"); //Creamos un objeto
        System.out.println("Lectura del raf:");
        for (int i = 0; i < raf.length()/8; i++) { //Reoetir hasta el ultimo archivo
            System.out.println("Valor: " + raf.readDouble()); //Imprimimos lo que hay en el raf
        }
        raf.close(); //Cerramos las impresiones del raf
    }
}
