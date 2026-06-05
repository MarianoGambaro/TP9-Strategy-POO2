package pt2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaFormatoLargo implements FormatoFecha {
    @Override
    public String formatear(LocalDate fecha) {
        //con Locale para que salga en español
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "AR"));
        return fecha.format(formatter);
    }
}
