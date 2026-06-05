package pt1;

public class Main {
    static void main() {

        var coleSur = new EnvioColectivosSur();
        var carrito = new CarritoDeCompras(coleSur, "capital federal");

        carrito.agregarProducto(new Producto(3000, 2));
        carrito.agregarProducto(new Producto(7000, 3));
        carrito.agregarProducto(new Producto(4000, 5));

        
        System.out.println("El coste total es: " + carrito.calcularTotal());
    }
}
