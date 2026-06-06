package pt3;

public class Medicina extends CalculadorDePrecios {

    public Medicina() {
        this.impuesto = 0.0;
    }

    @Override
    public double calcularDescuento(double precioBase) {
        return (precioBase > 50) ? 0.1 : 0.0;
    }

    @Override
    public boolean tieneEnvioGratis(double precioBase) {
        return (precioBase > 100);
    }
    
}
