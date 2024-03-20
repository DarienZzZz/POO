import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Distancia {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int estrellaX, estrellaY, estrellaZ;
        int cantidadPlanetas;
        int x, y, z;
        String name, auxPlaneta;
        double auxDistancia = 0, distancia;
        //Datos de entrada
        System.out.println("Coordenadas de la Estrella de la muerte");
        System.out.print("Coordena X: ");
        estrellaX = sc.nextInt();
        System.out.print("Coordena Y: ");
        estrellaY = sc.nextInt();
        System.out.print("Coordena Z: ");
        estrellaZ = sc.nextInt();
        //Numero de planetas
        System.out.print("Cantidad de planetas cercanas: ");
        cantidadPlanetas = sc.nextInt();
        sc.nextLine();
        //Arrays para guardar los datos de los plnetas
        double[] distanciaPlaneta = new double[cantidadPlanetas];
        String[] nombrePlaneta = new String[cantidadPlanetas];
        //Bucle para repetir la entrada de datos
        for (int i = 0; i < cantidadPlanetas; i++) {
            System.out.print("Nombre del planeta: ");
            name = sc.nextLine();
            System.out.print("Coordena X: ");
            x = sc.nextInt();
            System.out.print("Coordena Y: ");
            y = sc.nextInt();
            System.out.print("Coordena Z: ");
            z = sc.nextInt();
            sc.nextLine();
            distancia = Math.sqrt(Math.pow(x - estrellaX, 2) + Math.pow(y - estrellaY, 2) + Math.pow(z - estrellaZ, 2));
            distanciaPlaneta[i] = distancia;
            nombrePlaneta[i] = name;
        }
        //Método burbuja para odenar de menor a mayor (La idea que se nos ocurrió)
        for (int i = 0; i < distanciaPlaneta.length - 1; i++) {
            for (int j = 0; j < (distanciaPlaneta.length - 1 - i); j++) {
                if (distanciaPlaneta[j] > distanciaPlaneta[j + 1]){
                    // Acomodo de las distancias
                    auxDistancia = distanciaPlaneta[j];
                    distanciaPlaneta[j] = distanciaPlaneta[j + 1];
                    distanciaPlaneta[j + 1] = auxDistancia;
                    // Acomodo de los nombres
                    auxPlaneta = nombrePlaneta[j];
                    nombrePlaneta[j] = nombrePlaneta[j + 1];
                    nombrePlaneta[j + 1] = auxPlaneta;
                }
            }
        }
        //Mostramos lo que se nos piden
        System.out.println("");
        for (int i = 0; i < cantidadPlanetas; i++) {
            System.out.println("Distancia a " + nombrePlaneta[i] + ": " + distanciaPlaneta[i]);
        }
        System.out.println("El planeta más cercano es " + nombrePlaneta[0]);
    }
}
