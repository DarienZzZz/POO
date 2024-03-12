import java.util.Scanner;

public class EjercicioHerencia1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido");
        String fCaducidad;
        int numLote;
        int op;
        do{
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Crear Producto Fresco");
            System.out.println("2. Crear Producto Refrigerado");
            System.out.println("3. Crear Producto Congelado");
            System.out.println("4. Salir");
            op=sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                System.out.println("Tiren paro");
                    break;
                default:
                    break;
            }

        }while(op!=4);
    }
}
