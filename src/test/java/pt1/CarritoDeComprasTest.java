package pt1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarritoDeComprasTest {

    @Test
    public void compraConEnvioColectivosSur() {
        //setup
        var coleSur = new EnvioColectivosSur();
        var carrito = new CarritoDeCompras(coleSur, "Capital Federal");
        carrito.agregarProducto(new Producto(3000, 2));
        carrito.agregarProducto(new Producto(7000, 3));
        carrito.agregarProducto(new Producto(4000, 5));

        //ejec y verif
        assertEquals(15500, carrito.calcularTotal());
    }

    @Test
    public void compraConEnvioCorreoArg() {
        //setup
        var fake = new FakeServicioDistancia();
        var correoArg = new EnvioCorreoArgentino(fake);
        var carrito = new CarritoDeCompras(correoArg, "Viedma");
        carrito.agregarProducto(new Producto(3000, 2));
        carrito.agregarProducto(new Producto(7000, 3));
        carrito.agregarProducto(new Producto(4000, 5));

        //ejec y verif
        assertEquals(19800, carrito.calcularTotal());
    }
}