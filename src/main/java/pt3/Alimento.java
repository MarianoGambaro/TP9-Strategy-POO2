package pt3;

public class Alimento extends CalculadorDePrecios {

    public Alimento() {
        this.impuesto = 0.05;
    }

    @Override
    public double calcularDescuento(double precioBase) {
        return (precioBase > 100) ? 0.15 : 0.0;
    }

    @Override
    public boolean tieneEnvioGratis(double precioBase) {
        return (precioBase > 200);
    }
}
