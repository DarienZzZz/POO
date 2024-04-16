import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaLegisladores listaleg = new ListaLegisladores();

        int op;

        do {
            System.out.println("Camara de Diputados y Senadores");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Crear un Legislador");
            System.out.println("2. Mostrar legisladores");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    crearLegislador(listaleg);

                    break;
                case 2:
                    listaleg.mostrarLegislador();

                    break;
                case 3:
                    System.out.println("Adios");

                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 3);
    }

    static void crearLegislador(ListaLegisladores listaleg) {
        Scanner sc = new Scanner(System.in);
        int op2, edad;
        String nombre, dom, provincia;

        System.out.println("1. Dipuatado o 2. Senador");
        op2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el domicilio: ");
        dom = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese la provincia: ");
        provincia = sc.nextLine();
        if (op2 == 1) {
            Diputado dipu = new Diputado(nombre, dom, edad, provincia);
            listaleg.agregarLegislador(dipu);
        } else {
            Senador sen = new Senador(nombre, dom, edad, provincia);
            listaleg.agregarLegislador(sen);
        }
    }

}
