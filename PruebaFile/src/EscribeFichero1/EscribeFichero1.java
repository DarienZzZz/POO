package EscribeFichero1;

import java.io.*;

public class EscribeFichero1 {
    public static void main(String[] args) {
        String cad1 = "GGS.";
        String cad2 = "Esto es otra cadena.";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\SALA PAFP 28\\Documents\\Nomina\\GGS.docx"));
            bw.write(cad1);
            bw.newLine();
            bw.write(cad2);
            bw.flush();
            // Cerramos el stream
            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error IO: " + ioe.toString());
        }
    }
}