package pt1;

public class EnvioColectivosSur implements Envio {
    private static final double CAPITAL_FEDERAL = 1000;
    private static final double GRAN_BUENOS_AIRES = 1500;
    private static final double OTRO_DESTINO = 3000;

    @Override
    public double calcularCostoEnvio(String destino, double peso) {
        double costoEnvio = 0;
        if (destino.equalsIgnoreCase("Capital federal")) {
            costoEnvio = CAPITAL_FEDERAL;
        } else if (destino.equalsIgnoreCase("Gran buenos aires")) {
            costoEnvio = GRAN_BUENOS_AIRES;
        } else {
            costoEnvio = OTRO_DESTINO;
        }
        return costoEnvio + montoPorPeso(peso);
    }

    private double montoPorPeso(double peso) {
        double monto = 0;
        if (peso > 5 && peso < 30) {
            monto = 500;
        } else if (peso > 30) {
            monto = 2000;
        }
        return monto;
    }
}
