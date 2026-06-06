package pt3;

//reemplacé la interface por una clase abstracta para poder representar los demas productos
//que no tienen valores especificos, y asi no tener que crear una clase para "Otro"

public abstract class CalculadorDePrecios {
    // Valores por defecto
    protected double impuesto = 0.15;
    protected double dtoEnvioGratis = 10;

    public double calcularPrecioFinal(double precioBase) {
        double descuento = calcularDescuento(precioBase);
        double total = precioBase * (1 + impuesto) * (1 - descuento);

        if (tieneEnvioGratis(precioBase)) {
            total -= dtoEnvioGratis;
        }
        return total;
    }

    //valor por defecto para el descuento
    protected double calcularDescuento(double precioBase) {
        return (precioBase > 50) ? 0.05 : 0.0;
    }

    //valor por defecto para el envío
    protected boolean tieneEnvioGratis(double precioBase) {
        return precioBase > 200;
    }

}