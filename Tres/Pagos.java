import java.util.Scanner;

public class Pagos{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double I, C,i,n;
        int N;
        System.out.print("Ingrese el Interés anual: ");
        I=sc.nextDouble();
        System.out.print("Ingrese numero de años: ");
        N=sc.nextInt();
        System.out.print("Ingrese el  Capital del préstamo: ");
        C=sc.nextDouble();

        i=I/12;
        n=12*N;
        double cuota= C*(((Math.pow((1+i),n)*i))/(((Math.pow(1+i, n))-1)));
        
        System.out.println("Cuota mensual: $" + cuota);
        

    }
}