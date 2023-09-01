package Herencia;
import java.util.*;
public class Camisas extends Producto {
    Scanner sc = new Scanner(System.in);
    private String cantidad;
    public Camisas() {
        super();
        this.cantidad="";
    }
    public Camisas(String nombre, String color, String talla, double precio, String cantidad) {
        super(nombre, color, talla, precio);
        this.cantidad=cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getCantidad() {
        return cantidad;
    }
        //todo LLAMAMOS AL METODO ticker de la clase "PRODUCTO" asi poder usarlo
    public void ticket(){
        super.ticket();
        System.out.println("Ingrese la cantidad");
        setCantidad(sc.nextLine());
    }
     //? DE IGUAL FORMA EN ESTA PARTE DEL CODIGO LLAMAMOS A LA CLASE mostrar DE LA CLASE PRODUCTO asi poder usarlo
    public void mostrar(){
        super.mostrar();
        System.out.println("La cantidad es de "+cantidad);
        System.out.println("********************************");
    }
}









