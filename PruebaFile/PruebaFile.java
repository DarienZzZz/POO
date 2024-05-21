import java.io.File;
public class PruebaFile {
    public static void main(String[] args) throws Exception {
        //File nos sirve para obtener informacion sobre un archivo
        //Objeto de tipo file con la ruta de nuestro archivo
        File fichero = new File("D:\\Owner\\Documents\\aPOO\\Codigos\\PESO.txt");
        if (fichero.exists() && fichero.isFile()) { //Verificamos que fectivamente haya un fichero
            System.out.println("\n- Información del fichero:");
            System.out.println("El fichero tiene el nombre: " + fichero.getName()); //Nombre del archivo
            System.out.println("El fichero tiene el path: " + fichero.getAbsolutePath()); //Ruta del archivo
            System.out.println("Longitud del fichero: " + fichero.length()); //Cantidad de caracteres en el archivo
        }
        //De esta forma obtenemos el contenido total de una carpeta
        //Creamos un nuevo objeto tipo file donde ingresamos la ruta de muestra carpeta
        File directorio = new File("D:\\Owner\\Documents\\aPOO\\Codigos");
        if (directorio.exists() && directorio.isDirectory()) { //Verificamos que si exista una carpeta
            //Creamos una lista donde se se guardaran los nomobres de los archivos que haya en el directorio
            String listado[] = directorio.list();
            System.out.println("\n- Listado del directorio:"); 
            for (int i = 0; i < listado.length; i++) {//Repetimos hasta el ultimo arhicvo
                System.out.println(listado[i]); //Imprimios la
            }
        }
    }
}
