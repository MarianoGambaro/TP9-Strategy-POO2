package pt2;

import java.time.LocalDate;

public class Main {
    static void main() {

        var formatoCorto = new FechaFormatoCorto();
        var formatoLargo = new FechaFormatoLargo();

        var p = new Persona("Juan", LocalDate.of(2000, 3, 5), formatoLargo);

        System.out.println("Fecha de naciemiento de " + p.nombre() + " con formato largo: " + p.fechaNacimiento());

        p.formatoFecha(formatoCorto);

        System.out.println("Fecha de naciemiento de " + p.nombre() + " con formato corto: " + p.fechaNacimiento());
    }
}
