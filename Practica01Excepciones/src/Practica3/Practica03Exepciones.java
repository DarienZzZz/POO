package Practica3;

public class Practica03Exepciones {
    public static void main(String[] args) {

    }

    public class MiExcepcion extends Exception {
        /*
         * Constructor que regresa el mensaje que se quiere mostrar cuando ocurre la
         * Excepción y se
         * lo pasa al constructor de la clase Exception
         */
        public MiExcepcion(String mensajeError) {
            super(mensajeError);
        }
    }

    public static void validaPropia() {
        int n = 5;
        try {
            minimo(n);
            System.out.println(n + " es mayor a 10");
        } catch (MiExcepcion e) {
            System.out.println("No me sirve ese número");
        }
    }

    /* Método que lanza una Excepción propia */
    public static void minimo(int numero) throws MiExcepcion {
        if (numero <= 10) {
            // throw new MiExcepcion("Necesito un número mayor a 10");
        }
    }
}
