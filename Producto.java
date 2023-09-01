// La línea `paquete Herencia;` está declarando el nombre del paquete para la clase `Producto`. en Java,
// los paquetes se utilizan para organizar clases y evitar conflictos de nombres. El nombre del paquete suele ser un
// estructura de directorios que corresponde a la estructura del paquete. En este caso, la clase `Producto` es
// parte del paquete `Herencia`.
package Herencia;
import java.util.*;
public  class Producto {
    Scanner sc = new Scanner(System.in);

    protected String nombre;
    private String color;
    private String talla;
    private double precio;
     // El código `producto publico() { this.nombre=""; este.color=""; esto.talla=""; este.precio=0.0; }`
     // es un constructor de la clase `Producto`.
    public Producto() {
        this.nombre="";
        this.color="";
        this.talla="";
        this.precio=0.0;
    }
  // El código `public Producto(String nombre, String color, String talla, double precio) {
    // this.nombre=nombre; este.color=color; this.talla=talla; this.precio=precio; }` es un constructor
    // para la clase `Producto`.
    public Producto(String nombre, String color, String talla, double precio) {
        this.nombre=nombre;
        this.color=color;
        this.talla=talla;
        this.precio=precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getTalla() {
        return talla;
    }
        //ESTA PARTE DEL CODIOG NOS SIRVE PARA INGRESAR LOS DATOS//
   /**
   * La función "ticket" solicita al usuario que ingrese el nombre, color, tamaño y precio de un boleto.
     */
    public void ticket(){
            System.out.println("Ingrese el nombre ");
            setNombre(sc.nextLine());
            System.out.println("Ingrese el color ");
            setColor(sc.nextLine());
            System.out.println("Ingrese la talla");
            setTalla(sc.nextLine());
            System.out.println("Ingrese el precio ");
            setPrecio(sc.nextDouble());
    }
    //ESTA PARTE NOS SIRVE PARA MOSTRAR EL CODIGO //
 /**
  * La función "mostrar" imprime información sobre un producto, incluido su nombre, color, tamaño y
   * precio.
  */
    public void mostrar(){
        System.out.println("*******************************************");
        System.out.println("La informacion del producto es la siguiente");
        System.out.println("El nombre es "+nombre);
        System.out.println("El color es "+color);
        System.out.println("LA talla es "+talla);
        System.out.println("El precio es "+precio);
        
    }

   /**
     * La función toString() devuelve una representación de cadena de un objeto Camisa, incluido su nombre,
     * color, talla y precio.
     *
     * @return El método devuelve una representación de cadena de un objeto Camisa, que incluye el
     * nombre, color, talla y precio de la camiseta.
     */
    public String toString() {
        return "Camisa: " + nombre + ", Color: " + color + ", Talla: " +talla+", precio" +precio;
    }
}


