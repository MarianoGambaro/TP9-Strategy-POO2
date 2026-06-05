package pt1;

public class FakeServicioDistancia implements ServicioDistancia {
    @Override
    public int calcularDistancia(String origen, String destino) {
        return 1000;
    }
}
