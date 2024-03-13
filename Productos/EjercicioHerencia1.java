
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioHerencia1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido");
        //Variables Producto
        String fCaducidad;
        int numLote;
        int op;
        //Variables ProductoFresco
        String fEnvazado;
        String orginPais;
        //Variables ProductoRefrigerado
        String LAFDSMLFR;
        //Variables ProductoCongelado
        String tempRecomendada;
        //Arraylist para guardar los productos
        ArrayList<Producto> listaProductos = new ArrayList();
        //variable para los objetos
        ProductoFresco pf=null;
        ProductoRefrigerado pr = null;
        ProductoCongelado  pc= null;

        do{
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Crear Producto Fresco");
            System.out.println("2. Crear Producto Refrigerado");
            System.out.println("3. Crear Producto Congelado");
            System.out.println("4. Mostrar Productos");
            System.out.println("5. Salir");
            op=sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1://ProductoFresco
                System.out.println("¿Fecha de caducidad(dd/mm/aa)? ");
                fCaducidad = sc.nextLine(); //lee un String
                System.out.println("¿Numero de lote? ");
                numLote = sc.nextInt();//lee un entero
                sc.nextLine();
                System.out.println("¿Pais de origen? ");
                orginPais = sc.nextLine(); //lee un String
                System.out.println("¿Fecha de envazado(dd/mm/aa)? ");
                fEnvazado = sc.nextLine(); //lee un String
                pf =new ProductoFresco(fCaducidad, numLote, fEnvazado, orginPais);
                listaProductos.add(pf);
                break;

                case 2://ProductoRefrgerado
                System.out.println("¿Fecha de caducidad(dd/mm/aa)? ");
                fCaducidad = sc.nextLine(); //lee un String
                System.out.println("¿Numero de lote? ");
                numLote = sc.nextInt();//lee un entero
                sc.nextLine();
                System.out.println("¿ código del organismo de supervisión alimentaria? ");
                LAFDSMLFR = sc.nextLine(); //lee un String
                pr=new ProductoRefrigerado(fCaducidad, numLote, LAFDSMLFR);
                listaProductos.add(pr);
                    break;

                case 3://ProductoCongelado
                System.out.println("¿Fecha de caducidad(dd/mm/aa)? ");
                fCaducidad = sc.nextLine(); //lee un String
                System.out.println("¿Numero de lote? ");
                numLote = sc.nextInt();//lee un entero
                sc.nextLine();
                System.out.println("¿Temperatura Recomendada(c)? ");
                tempRecomendada = sc.nextLine(); //lee un entero
                sc.nextLine();
                pc=new ProductoCongelado(fCaducidad, numLote, tempRecomendada);
                listaProductos.add(pc);
                    break;
                case 4:
                for (int i = 0; i < listaProductos.size(); i++) {
                    Producto producto = listaProductos.get(i);
                    System.out.println(producto.toString());
                    
                }
                    break;
               
                case 5:
                System.out.println("Tiren paro");
                    break;
                default:
                    break;
            }

        }while(op!=5);
    }
}
