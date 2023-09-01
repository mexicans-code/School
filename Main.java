package Herencia;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    Scanner sc = new Scanner(System.in);
    static ArrayList<Camisas> listcamisas = new ArrayList<>();
    static Iterator<Camisas> itcamisas = listcamisas.iterator();
    static ArrayList<Pantalones> listpantalones = new ArrayList<>();
    static Iterator<Pantalones> itpantalones = listpantalones.iterator();
    static ArrayList<Camisetas> listcCamisetas = new ArrayList<>();
    static Iterator<Camisetas> itcamisetas = listcCamisetas.iterator();
    static ArrayList<Shorts> listsShorts = new ArrayList<>();
    static Iterator<Shorts> itshor = listsShorts.iterator();
public static void menu(){
        int opc;
        do {
                System.out.println("BIENVENIDO AL MENU DE ROPA SIGUE LAS INSTRUCCIONES ");
            Scanner sc = new Scanner(System.in);
            System.out.println("1) * Alta Camisas \n2) * Mostrar Camisas \n3) * Alta Pantalones \n4) * Mostrar Pantalones  \n5) * Alta Camisetas  \n6) * Mostrar Camisetas \n7) * Alta Shorts \n8) * Mostrar Shorts \n9) * Eliminar Camisa \n10)* Eliminar Pantalones \n11)* Eliminar Camisetas \n12)* Eliminar Shorts \n13)* Modificar Camisa \n14)* Modificar Pantalon \n15)* Modificar Camiseta \n16)* Modificar Shorts \n17)* Buscar Camisa  \n18)* Buscar Pantalon \n19)* Buscar Camiseta \n20)* Buscar Short \n21)* Todos Tus Productos \n22) Salir de la Tienda!");
            System.out.println("Ingrese la opcion");
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                insertarCamisas();
                    break;
                case 2: 
                    System.out.println("La informacion de las camisas son: ");
                ImprimirCamisas();
                break;
                case 3:
                insertarPantalon();
                break;
                case 4: 
                System.out.println("La informacion de los pantalones es ");
                ImprimirPantalones();
                break;
                case 5: 
                insertarCamisetas();
                break;
                case 6:
                System.out.println("La Informacion de las camisetas es: ");
                ImprimirCamisetas();
                break;
                case 7:
                 insertarShorts();
                break;
                case 8:
                System.out.println("La informacion de los Shorts es: ");
                ImprimirShorts();
                break;
                case 9: 
                eliminarCamisa();
                break;
                case 10:
                eliminarPantalones();
                break;
                case 11:
                eliminarCamiseta();
                break;
                case 12:
                eliminarShorts();
                break;
                case 13:
                modificarCamisas();
                break;
                case 14:
                modificarPantalon();
                break;
                case 15:
                modificarCamisetas();
                break;
                case 16:
                modificarShorts();
                break;
                case 17:
                BuscarCamisa();
                break;
                case 18:
                BuscarPantalon();
                break;
                case 19:
                BuscarCamiseta();
                break;
                case 20:
                BuscarShort();
                break;
                case 21:
                System.out.println("Tus Camisas Agregadas son las Siguientes: ");
                ImprimirCamisas();
                System.out.println("Tus Pantalones Agregados son los Siguientes: ");
                ImprimirPantalones();
                System.out.println("Tus Camisetas Agregadas son las Siguientes: ");
                ImprimirCamisetas();
                System.out.println("Tus Shorts Agregados son los Siguientes: ");
                ImprimirShorts();
                break;
                case 22:
                System.out.println("Saliste del Menu de Compras! Hasta Luego! :D");
                System.exit(opc);
                break;
                default:
                    System.out.println("No existe esa opcion! :) ");
                    break;
            }
            
        } while (opc!=21);   
    }
    //? METODOS PARA IPRIMIR EN PANTALLA//
/**
   * La función itera a través de una lista de objetos "Camisas" y llama al método "mostrar" en cada
   * objeto, seguido de la impresión de una nueva línea.
   */
public static void ImprimirCamisas(){
        itcamisas = listcamisas.iterator();
        while (itcamisas.hasNext()) {
            Camisas next = itcamisas.next();
            next.mostrar();
                System.out.println("\n ");
        }
}

public  static void ImprimirPantalones(){
    itpantalones = listpantalones.iterator();
    while (itpantalones.hasNext()) {
        Pantalones next = itpantalones.next();
        next.mostrar();
            System.out.println("\n ");
    }
}

public static void ImprimirCamisetas(){
    itcamisetas = listcCamisetas.iterator();
    while (itcamisetas.hasNext()) {
        Camisetas next = itcamisetas.next();
        next.mostrar();
            System.out.println("\n ");
    }
}

public static void ImprimirShorts(){    
    itshor =listsShorts.iterator();
    while (itshor.hasNext()) {
        Shorts next = itshor.next();
        next.mostrar();
            System.out.println("\n ");
    }
}

//! ************************** METODOS PARA BORRAR ************************************* //
/**
  * La función "eliminarCamisa" permite al usuario ingresar el nombre de una camiseta que desea eliminar de
  * una lista de camisas y luego elimina esa camisa de la lista.
  */
public static void eliminarCamisa() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la camisa  que desea eliminar: ");
    String nombre = sc.nextLine();
    for (int i = 0; i < listcamisas.size(); i++) {
        Camisas cami = listcamisas.get(i);
        if (cami.getNombre().equalsIgnoreCase(nombre)) {
            listcamisas.remove(i);
            System.out.println("La camisa ha sido Eliminada");
        }
    }
    
}
public static void eliminarPantalones() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el pantalon que desea eliminar: ");
    String nombre = sc.nextLine();
    for (int i = 0; i < listpantalones.size(); i++) {
        Pantalones cami = listpantalones.get(i);
        if (cami.getNombre().equalsIgnoreCase(nombre)) {
            listpantalones.remove(i);
            System.out.println("El pantalon ha sido Eliminada");
          
        }
    }
    
}

public  static void eliminarCamiseta() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la camiseta que desea eliminar: ");
    String nombre = sc.nextLine();
    for (int i = 0; i < listcCamisetas.size(); i++) {
        Camisetas cami = listcCamisetas.get(i);
        if (cami.getNombre().equalsIgnoreCase(nombre)) {
            listcCamisetas.remove(i);
            System.out.println("La camiseta ha sido Eliminada");
           
        }
    }
    
}

public static void eliminarShorts() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el short que desea eliminar: ");
    String nombre = sc.nextLine();
    for (int i = 0; i < listsShorts.size(); i++) {
        Shorts cami = listsShorts.get(i);
        if (cami.getNombre().equalsIgnoreCase(nombre)) {
            listsShorts.remove(i);
            System.out.println("el short ha sido Eliminada");
        }
    }
    
}
//todo ***************************Metodos para Insertar Producto!**********************************************

/**
    * La función "insertarCamisas" crea una nueva instancia de la clase "Camisas", llama al "ticket"
    * en él, y lo agrega a una lista llamada "listcamisas".
    */
    public static void insertarCamisas(){
        Camisas cam = new Camisas();
        cam.ticket();
        listcamisas.add(cam);
    }

    public static void insertarPantalon(){
        Pantalones pan = new Pantalones();
                pan.ticket();
                listpantalones.add(pan);
    }
    public static void insertarCamisetas(){
        Camisetas cami = new Camisetas();
        cami.ticket();
        listcCamisetas.add(cami);
    }
    
    public static void insertarShorts(){
        Shorts sh = new Shorts();
        sh.ticket();
        listsShorts.add(sh);
    }
    //! ************************ METODOS PARA MODIFICAR******************************************//

/**
     * La función "modificarCamisas" permite al usuario buscar una camiseta específica por su nombre y luego
     * modificar su nombre.
     */
    public static void modificarCamisas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la Camisa a buscar: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < listcamisas.size(); i++) {
            if (listcamisas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingresa el nuevo nombre de la Camisa: ");
                String nuevaCamiseta = sc.nextLine();
                listcamisas.get(i).setNombre(nuevaCamiseta);
            }
        }

    }
    public static void modificarPantalon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del pantalon a buscar: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < listpantalones.size(); i++) {
            if (listpantalones.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingresa el nuevo nombre del pantalon: ");
                String nuevaCamiseta = sc.nextLine();
                listpantalones.get(i).setNombre(nuevaCamiseta);
            }
        }

    }
    public static void modificarCamisetas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la Camiseta a buscar: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < listcCamisetas.size(); i++) {
            if (listcCamisetas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingresa el nuevo nombre de la Camiseta: ");
                String nuevaCamiseta = sc.nextLine();
                listcCamisetas.get(i).setNombre(nuevaCamiseta);
            }
        }
        
    }

    

    public static void modificarShorts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del Short a buscar: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < listsShorts.size(); i++) {
            if (listsShorts.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingresa el nuevo nombre del Short: ");
                String nuevaCamiseta = sc.nextLine();
                listsShorts.get(i).setNombre(nuevaCamiseta);
            }
        }

    }

    //! ******************* METODOS PARA BUSCAR*************************** //

/**
   * La función "BuscarCamisa" permite al usuario buscar un producto específico (camisa) por su nombre
   * e imprime los detalles del producto correspondiente.
   */
    public static void BuscarCamisa() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del Producto a buscar!");
        nombre = sc.nextLine();
        for (int i = 0; i < listcamisas.size(); i++) {
            if (listcamisas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(listcamisas.get(i));

            }

        }
    }
    public static void BuscarPantalon() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del Producto a buscar!");
        nombre = sc.nextLine();
        for (int i = 0; i < listpantalones.size(); i++) {
            if (listpantalones.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(listpantalones.get(i));

            }

        }
    }
    public static void BuscarCamiseta() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del Producto a buscar!");
        nombre = sc.nextLine();
        for (int i = 0; i < listcCamisetas.size(); i++) {
            if (listcCamisetas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(listcCamisetas.get(i));

            }

        }
    }
    public static void BuscarShort() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del Producto a buscar!");
        nombre = sc.nextLine();
        for (int i = 0; i < listsShorts.size(); i++) {
            if (listsShorts.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(listsShorts.get(i));

            }

        }
        sc.close();

    }









}




