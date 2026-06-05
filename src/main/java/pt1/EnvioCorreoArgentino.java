package pt1;

public class EnvioCorreoArgentino implements Envio {
    private static final double CAPITAL_FEDERAL = 500;
    private static final double OTRO_DESTINO = 800;

    private ServicioDistancia servicioDistancia;//deberia implementar el servicio web e inyectarlo a la instancia

    public EnvioCorreoArgentino(ServicioDistancia servicioDistancia) {
        this.servicioDistancia = servicioDistancia;
    }

    @Override
    public double calcularCostoEnvio(String destino, double peso) {
        if (destino.equalsIgnoreCase("Capital Federal")) {
            return CAPITAL_FEDERAL;
        }
        double km = servicioDistancia.calcularDistancia("Capital Federal", destino);
        return OTRO_DESTINO + (5 * km);
    }
}
