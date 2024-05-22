import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ArchivoAccesoAleatorio {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();//Se declara una array para guardar nombres y edades
        listaPersonas.add(new Persona("Juan", 25));
        listaPersonas.add(new Persona("María", 35));
        listaPersonas.add(new Persona("Pablo", 28));
        listaPersonas.add(new Persona("Luisa", 34));
        listaPersonas.add(new Persona("Ileana", 35));
        listaPersonas.add(new Persona("Martín", 40));
        //Caracteres 2 bytes por caracter
        //int 4 bytes

        try {//Excepción 

            guardarObjetosEnArchivoAleatorio(listaPersonas, "miArchivo.dat");//Se llama al metodo guardarObjetosEnArchivoAleatorio
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }

        try {
            Persona persona = leerObjetoEnPosicion(44, "miArchivo.dat");
            System.out.println(persona.getNombre() + ", " + persona.getEdad());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static void guardarObjetosEnArchivoAleatorio(ArrayList<Persona> listaPersonas, String nombreArchivo)
            throws FileNotFoundException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(nombreArchivo, "rw");

        for (Persona persona : listaPersonas) {
            StringBuffer sb = new StringBuffer(persona.getNombre());//Se declara una variable para despues poner un limite universal
            sb.setLength(20); // se define una longitud fija para todos los nombres
            randomAccessFile.writeChars(sb.toString()); // escribe el nombre de persona
            randomAccessFile.writeInt(persona.getEdad());// escribe la edad de persona
        }
        randomAccessFile.close();
    }

    public static Persona leerObjetoEnPosicion(long posicion, String nombreArchivo)
            throws FileNotFoundException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(nombreArchivo, "r");
        randomAccessFile.seek(posicion);

        String nombre = "";
        for (int i = 0; i < 20; i++)
            nombre += randomAccessFile.readChar();
        int edad = randomAccessFile.readInt();

        Persona persona = new Persona(nombre, edad);

        randomAccessFile.close();

        return persona;
    }
}