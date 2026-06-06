package pt3;

public class Main {
    static void main() {
        var p1 = new Producto(new Libro(), 30);
        var p2 = new Producto(new Medicina(), 330);
        var p3 = new Producto(new Alimento(), 130);
        var p4 = new Producto(new CalculadorDePrecios() {
        }, 130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}
