import java.util.Scanner;
public class Kyber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, r3;
        double resistenciaSerie, resistenciaParalelo;

        System.out.println("Valores de resistencia los cristaleskyber");
        System.out.print("Primera resistencia: ");
        r1=sc.nextDouble(); 
        System.out.print("Segunda resistencia: ");
        r2=sc.nextDouble(); 
        System.out.print("Tercera resistencia: ");
        r3=sc.nextDouble(); 

        resistenciaSerie= r1+r2+r3;
        resistenciaParalelo= 1/((1/r1)+(1/r2)+(1/r3));

        System.out.println("Resistencia total en serie: "+resistenciaSerie);
        System.out.println("Resistencia total en paralelo: "+resistenciaParalelo);
    }
}
