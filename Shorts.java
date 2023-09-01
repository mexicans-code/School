package Herencia;
import java.util.*;
public class Shorts extends Producto {
    Scanner sc = new Scanner(System.in);
    private String descripcion;

    public Shorts() {
        this.descripcion = "";
    }
    public Shorts(String nombre, String color, String talla, double precio, String cantidad) {
        super(nombre, color, talla, precio);
        this.descripcion = descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void ticket() {
        super.ticket();
        System.out.println("Ingrese la descripcion del producto ");
        setDescripcion(sc.nextLine());
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("La descripcion del producto es la siguiente " + descripcion);
        System.out.println("********************************");
    }

}
