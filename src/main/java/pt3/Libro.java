package pt3;

public class Libro extends CalculadorDePrecios {

    public Libro() {
        this.impuesto = 0.1;
    }

    @Override
    protected double calcularDescuento(double precioBase) {
        return 0.1;
    }

    @Override
    protected boolean tieneEnvioGratis(double precioBase) {
        return precioBase > 100;
    }
}
