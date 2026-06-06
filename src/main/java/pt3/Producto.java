package pt3;

public class Producto {
    public CalculadorDePrecios calculadorDePrecios;
    public double precio;

    public Producto(CalculadorDePrecios calculador, double precio) {
        this.calculadorDePrecios = calculador;
        this.precio = precio;
    }

    public double precioFinal() {
        double total = calculadorDePrecios.calcularPrecioFinal(precio);
        return total;
    }
}






