package pt1;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private List<Producto> productos = new ArrayList<>();
    private Envio tipoEnvio;
    private String destino;


    public CarritoDeCompras(Envio tipoEnvio, String destino) {
        this.tipoEnvio = tipoEnvio;
        this.destino = destino;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        total = tipoEnvio.calcularCostoEnvio(this.destino, this.pesoTotal());
        total += this.calcularSubtotalProductos();
        return total;
    }

    public double pesoTotal() {
        return productos.stream().mapToDouble(Producto::peso).sum();
    }

    private double calcularSubtotalProductos() {
        return productos.stream().mapToDouble(Producto::precio).sum();
    }
}
