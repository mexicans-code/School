package Herencia;
import java.util.*;
public class Pantalones extends Producto {
    Scanner sc = new Scanner(System.in);
    private String tipo;
    public Pantalones() {
        this.tipo = "";
    }
    public Pantalones(String nombre, String color, String talla, double precio, String tipo) {
        super(nombre, color, talla, precio);
        this.tipo = tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void ticket() {
        super.ticket();
        System.out.println("Ingrese el tipo ");
        setTipo(sc.nextLine());
    }

    
    public void mostrar() {
        super.mostrar();
        System.out.println("El tipo es " + tipo);
        System.out.println("********************************");
    }
}
