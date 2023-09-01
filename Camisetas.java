package Herencia;
import java.util.*;
public class Camisetas extends Producto {
    Scanner sc = new Scanner(System.in);
    private String marca;

    public Camisetas() {
        this.marca = "";
    }
    public Camisetas(String nombre, String color, String talla, double precio, String marca) {
        super(nombre, color, talla, precio);
        this.marca = marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void ticket() {
        super.ticket();
        System.out.println("Ingrese la marca ");
        setMarca(sc.nextLine());
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("El tipo es " + marca);
        System.out.println("********************************");
    }
}
